package com.neuedu.dangqun01.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neuedu.dangqun01.entity.activity;
import com.neuedu.dangqun01.entity.advice;
import com.neuedu.dangqun01.entity.artical;
import com.neuedu.dangqun01.entity.dream;
import com.neuedu.dangqun01.entity.located;
import com.neuedu.dangqun01.entity.partyattend;
import com.neuedu.dangqun01.entity.ptdreamsolve;
import com.neuedu.dangqun01.entity.user;
import com.neuedu.dangqun01.service.activityservice;
import com.neuedu.dangqun01.service.adviceservice;
import com.neuedu.dangqun01.service.articalservice;
import com.neuedu.dangqun01.service.dreamservice;
import com.neuedu.dangqun01.service.locatedservice;
import com.neuedu.dangqun01.service.userservice;

@Controller
public class rycontroller {
	@Autowired
	userservice userService;
	@Autowired
	articalservice  articalService;
	@Autowired
	locatedservice locatedService;
	@Autowired
	activityservice activityService;
	@Autowired
	adviceservice  adviceService;
	@Autowired
	dreamservice dreamService;
	
	 //活动模块
	 //按钮参与活动
	   @RequestMapping("/canyu")
		public String test1(@RequestParam("id")String id,HttpServletRequest req){
		   //从seesion中读取user和该artical
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		   //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			
			//更新报名人数并回写数据库
			Integer checkedcurrent = A.getCheckedcurrent();
			checkedcurrent++;
			A.setCheckedcurrent(checkedcurrent);
			activityService.updateActivityById(A);
			
			//new一个p对象
			partyattend p = new partyattend();
			p.setActivityid(A.getId());
		    p.setUserid(u.getId());
		    p.setLocatedid(u.getLocatedid());
		    p.setAttend(0);
			activityService.addNewPtAtd(p);
		    return "redirect:toryac1";
		}
	   //按钮撤销活动
	   @RequestMapping("/chexiao")
		public String test2(@RequestParam("id")String id,HttpServletRequest req){
		   //从seesion中读取user和该artical
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			
			//更新报名人数并回写数据库
			Integer checkedcurrent = A.getCheckedcurrent();
			checkedcurrent--;
			A.setCheckedcurrent(checkedcurrent);
			activityService.updateActivityById(A);
			
            //通过活动id 用户id查p
			partyattend P = activityService.getPtAtdBy2(A.getId(), u.getId());
		    activityService.delPtAtdById(P.getId());
			return "redirect:toryac1";
		}
	   
	   
	   //按钮参与活动(内部)
	   @RequestMapping("/canyu2")
		public String test3(@RequestParam("id")String id,HttpServletRequest req,RedirectAttributes attr){
		   //从seesion中读取user和该artical
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		   //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			
			//更新报名人数并回写数据库
			Integer checkedcurrent = A.getCheckedcurrent();
			checkedcurrent++;
			A.setCheckedcurrent(checkedcurrent);
			activityService.updateActivityById(A);
			
			//new一个p对象
			partyattend p = new partyattend();
			p.setActivityid(A.getId());
		    p.setUserid(u.getId());
		    p.setLocatedid(u.getLocatedid());
		    p.setAttend(0);
			activityService.addNewPtAtd(p);
			//回写参数
		    attr.addAttribute("id", id);
		    return "redirect:toryac2";
		}
	   //按钮撤销活动(内部)
	   @RequestMapping("/chexiao2")
		public String test4(@RequestParam("id")String id,HttpServletRequest req,RedirectAttributes attr){
		   //从seesion中读取user和该artical
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			
			//更新报名人数并回写数据库
			Integer checkedcurrent = A.getCheckedcurrent();
			checkedcurrent--;
			A.setCheckedcurrent(checkedcurrent);
			activityService.updateActivityById(A);
			
			
            //通过活动id 用户id查p
			partyattend P = activityService.getPtAtdBy2(A.getId(), u.getId());
		    activityService.delPtAtdById(P.getId());
		  //回写参数
		    attr.addAttribute("id", id);
			return "redirect:toryac2";
		}
	 //建议部分
	 //新建建议表单
	   @RequestMapping("/addadvice")
		public String test5(HttpServletRequest req) throws Exception{
		    
		 //从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		 //用locatedid转化为实际信息
		     located L = locatedService.getlocatedById(u.getLocatedid()); 
		   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
		    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		    // 获取表单参数，不是string需要转换
		    String name = multipartRequest.getParameter("name");
		    String content = multipartRequest.getParameter("content");
		    advice A = new advice();
		    
		  //获得Request中的图片 photo 是from表单文件的name  
		    MultipartFile file = (MultipartFile) multipartRequest.getFile("img");     
		     System.out.println("这是图片"+file);
		    
		     if(file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length()>0){  
		         //图片服务器路径  
		    	 String file_path = "D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
		         //数据库存储路径（去掉之前的路径，要不显示的时候显示不出来）
		    	 String file_path2 = "static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
		    	 //原始文件名  
		         String originalFileName = file.getOriginalFilename();  
		         //新文件名，添加原始文件名后缀  
		         String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));  
		         //创建新文件，路径为：图片服务器路径+新文件名  
		         File newFile = new File(file_path + newFileName);  
		         System.out.println("文件地址"+file_path+newFileName);
		         //将内存中的数据写入磁盘  
		         file.transferTo(newFile);  
		         //将所有属性写入  
	            A.setImgpath(file_path2 + newFileName);
	            A.setName(name);
	            A.setBack04(content);//由于部分属性未导入所以变更为back04 
		    } 
		     //提取user的locatedid到artical
		     //System.out.println(u.getLocatedid());
		     A.setLocatedid(u.getLocatedid());
		     A.setUserid(u.getId());
		     adviceService.addNewAdvice(A);
		   return "redirect:toryad1";
		}
	   
	   
	 //修改建议表单
	   @RequestMapping("/updateadvice")
		public String test6(HttpServletRequest req) throws Exception{
		    
		 //从seesion中读取user和该artical
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     advice A = (advice) session.getAttribute("advice");
		 //用locatedid转化为实际信息
		     located L = locatedService.getlocatedById(u.getLocatedid()); 
		   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
		    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		    // 获取表单参数，不是string需要转换
		    String name = multipartRequest.getParameter("name");
		    String content = multipartRequest.getParameter("content");
		    
		    //删除原图片
		    String file_path3 ="D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\"+A.getImgpath();
		    File file2 = new File(file_path3);
		    file2.delete();
		    
		  //获得Request中的图片 photo 是from表单文件的name  
		    MultipartFile file = (MultipartFile) multipartRequest.getFile("img");     
		     System.out.println("这是图片"+file);
		    
		     if(file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length()>0){  
		         //图片服务器路径  
		    	 String file_path = "D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
		         //数据库存储路径（去掉之前的路径，要不显示的时候显示不出来）
		    	 String file_path2 = "static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
		    	 //原始文件名  
		         String originalFileName = file.getOriginalFilename();  
		         //新文件名，添加原始文件名后缀  
		         String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));  
		         //创建新文件，路径为：图片服务器路径+新文件名  
		         File newFile = new File(file_path + newFileName);  
		         System.out.println("文件地址"+file_path+newFileName);
		         //将内存中的数据写入磁盘  
		         file.transferTo(newFile);  
		         //将所有属性写入  
	            A.setImgpath(file_path2 + newFileName);
	            A.setName(name);
	            A.setBack04(content);
		    } 
		     adviceService.updateAdviceById(A);
		   return "redirect:toryad1";
		}
	   
	   

	   //按钮删除建议
	   @RequestMapping("/deladvice")
		public String test7(@RequestParam("id")String id,HttpServletRequest req){
		 //从advice1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该advice
			advice  A = adviceService.selectAdviceById(Integer.parseInt(id));
			 //删除图片文件
		    String file_path3 ="D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\"+A.getImgpath();
		    File file2 = new File(file_path3);
		    file2.delete();
		    //在数据库进行删除
		    adviceService.delAdviceById(Integer.parseInt(id));
			return "redirect:toryad1";
		}
	   
	   
	   
	 //心愿部分
		 //新建心愿表单
		   @RequestMapping("/adddream")
			public String test8(HttpServletRequest req) throws Exception{
			    
			 //从seesion中读取user
			     HttpSession session = req.getSession();  
			     user u = (user) session.getAttribute("user");
			 //用locatedid转化为实际信息
			     located L = locatedService.getlocatedById(u.getLocatedid()); 
			   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
			    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
			    // 获取表单参数，不是string需要转换
			    String name = multipartRequest.getParameter("name");
			    String content = multipartRequest.getParameter("content");
			    dream D = new dream();
			    
			  //获得Request中的图片 photo 是from表单文件的name  
			    MultipartFile file = (MultipartFile) multipartRequest.getFile("img");     
			     System.out.println("这是图片"+file);
			    
			     if(file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length()>0){  
			         //图片服务器路径  
			    	 String file_path = "D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
			         //数据库存储路径（去掉之前的路径，要不显示的时候显示不出来）
			    	 String file_path2 = "static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
			    	 //原始文件名  
			         String originalFileName = file.getOriginalFilename();  
			         //新文件名，添加原始文件名后缀  
			         String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));  
			         //创建新文件，路径为：图片服务器路径+新文件名  
			         File newFile = new File(file_path + newFileName);  
			         System.out.println("文件地址"+file_path+newFileName);
			         //将内存中的数据写入磁盘  
			         file.transferTo(newFile);  
			         //将所有属性写入  
		            D.setImgpath(file_path2 + newFileName);
		            D.setName(name);
		            D.setAdopted(0);
		            D.setSolved(0);
		            D.setPoint(1);
		            D.setContent(content);//由于部分属性未导入所以变更为back04 
			    } 
			     //提取user的locatedid到artical
			     //System.out.println(u.getLocatedid());
			     D.setLocated(u.getLocatedid());
			     D.setUseid(u.getId());
			     dreamService.insert(D);
			   return "redirect:torydr1";
			}
	   
		 //修改心愿表单
		   @RequestMapping("/updatedream")
			public String test9(HttpServletRequest req) throws Exception{
			    
			 //从seesion中读取user和该artical
			     HttpSession session = req.getSession();  
			     user u = (user) session.getAttribute("user");
			     dream D = (dream) session.getAttribute("dream");
			 //用locatedid转化为实际信息
			     located L = locatedService.getlocatedById(u.getLocatedid()); 
			   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
			    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
			    // 获取表单参数，不是string需要转换
			    String name = multipartRequest.getParameter("name");
			    String content = multipartRequest.getParameter("content");
			    
			    //删除原图片
			    String file_path3 ="D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\"+D.getImgpath();
			    File file2 = new File(file_path3);
			    file2.delete();
			    
			  //获得Request中的图片 photo 是from表单文件的name  
			    MultipartFile file = (MultipartFile) multipartRequest.getFile("img");     
			     System.out.println("这是图片"+file);
			    
			     if(file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length()>0){  
			         //图片服务器路径  
			    	 String file_path = "D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
			         //数据库存储路径（去掉之前的路径，要不显示的时候显示不出来）
			    	 String file_path2 = "static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
			    	 //原始文件名  
			         String originalFileName = file.getOriginalFilename();  
			         //新文件名，添加原始文件名后缀  
			         String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));  
			         //创建新文件，路径为：图片服务器路径+新文件名  
			         File newFile = new File(file_path + newFileName);  
			         System.out.println("文件地址"+file_path+newFileName);
			         //将内存中的数据写入磁盘  
			         file.transferTo(newFile);  
			         //将所有属性写入  
		            D.setImgpath(file_path2 + newFileName);
		            D.setName(name);
		            D.setContent(content);
			    } 
			     dreamService.updateDreamById(D);
			   return "redirect:torydr1";
			}
		   
		   //按钮删除愿望
		   @RequestMapping("/deldream")
			public String test10(@RequestParam("id")String id,HttpServletRequest req){
			 //从advice1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该advice
			    dream   D = dreamService.selectDreamById(Integer.parseInt(id));
				 //删除图片文件
			    String file_path3 ="D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\"+D.getImgpath();
			    File file2 = new File(file_path3);
			    file2.delete();
			    //在数据库进行删除
			    dreamService.deleteById(Integer.parseInt(id));
				return "redirect:torydr1";
			}
		   
			 //提交心愿评价内容
			   @RequestMapping("/addpj")
			   public String test12(dream d ,HttpServletRequest req) throws Exception{
				   //从session中取到该愿望
				   HttpSession session = req.getSession();
				   dream D  = (dream)session.getAttribute("dream");
				   ptdreamsolve P =(ptdreamsolve)session.getAttribute("ptds");
			   	   //将界面中的回复添加到对象D中
				   //不是未解决则修改solved
				   if(d.getSolved()!=2)
				   {    if(d.getSolved()==0)
					        D.setSolved(0);
				        else
				        	{D.setSolved(1);
				        	//党员加分
				        	//此处应该从活动中取党员id
							user u = userService.selectUserById(P.getUserid());  
							//加分
							Float point = u.getPoint();
							point = point+D.getPoint();
							u.setPoint(point);
							//数据库回写
							userService.updateByPrimaryKey(u);
				        	}
				   }
				   else {
					   //如果为未解决，删除该P，并将其solved改为0
					    dreamService.deleteptdsById(P.getId());
					    D.setSolved(0);
						
				   }
				 //数据库回写
				   dreamService.updateDreamById(D);
			   	return "redirect:torydr1";
			   	
			    }
			   //党员专区
			   //党员活动
				 //按钮参与活动
				   @RequestMapping("/dangcanyu")
					public String test13(@RequestParam("id")String id,HttpServletRequest req){
					   //从seesion中读取user和该artical
					     HttpSession session = req.getSession();  
					     user u = (user) session.getAttribute("user");
					   //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
						activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
						//更新报名人数并回写数据库
						Integer checkedcurrent = A.getCheckedcurrent();
						checkedcurrent++;
						A.setCheckedcurrent(checkedcurrent);
						activityService.updateActivityById(A);
						//new一个p对象
						partyattend p = new partyattend();
						p.setActivityid(A.getId());
					    p.setUserid(u.getId());
					    p.setLocatedid(u.getLocatedid());
					    p.setAttend(0);
					    //将活动举办时间写入P中
					    p.setEndtime(A.getHoldtime());
						activityService.addNewPtAtd(p);
					    return "redirect:toryda4";
					}
				   //按钮撤销活动
				   @RequestMapping("/dangchexiao")
					public String test14(@RequestParam("id")String id,HttpServletRequest req){
					   //从seesion中读取user和该artical
					     HttpSession session = req.getSession();  
					     user u = (user) session.getAttribute("user");
					     //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
						activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
						//更新报名人数并回写数据库
						Integer checkedcurrent = A.getCheckedcurrent();
						checkedcurrent--;
						A.setCheckedcurrent(checkedcurrent);
						activityService.updateActivityById(A);
						
			            //通过活动id 用户id查p
						partyattend P = activityService.getPtAtdBy2(A.getId(), u.getId());
					    activityService.delPtAtdById(P.getId());
						return "redirect:toryda4";
					}
				   
				   
				   //按钮参与活动(内部)
				   @RequestMapping("/dangcanyu2")
					public String test15(@RequestParam("id")String id,HttpServletRequest req,RedirectAttributes attr){
					   //从seesion中读取user和该artical
					     HttpSession session = req.getSession();  
					     user u = (user) session.getAttribute("user");
					   //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
						activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
						
						//更新报名人数并回写数据库
						Integer checkedcurrent = A.getCheckedcurrent();
						checkedcurrent++;
						A.setCheckedcurrent(checkedcurrent);
						activityService.updateActivityById(A);
						
						//new一个p对象
						partyattend p = new partyattend();
						p.setActivityid(A.getId());
					    p.setUserid(u.getId());
					    p.setLocatedid(u.getLocatedid());
					    p.setAttend(0);
					    //将活动举办时间写入P中
					    p.setEndtime(A.getHoldtime());
						activityService.addNewPtAtd(p);
						//回写参数
					    attr.addAttribute("id", id);
					    return "redirect:toryda4";
					}
				   //按钮撤销活动(内部)
				   @RequestMapping("/dangchexiao2")
					public String test16(@RequestParam("id")String id,HttpServletRequest req,RedirectAttributes attr){
					   //从seesion中读取user和该artical
					     HttpSession session = req.getSession();  
					     user u = (user) session.getAttribute("user");
					     //从activty1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
						activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
						
						//更新报名人数并回写数据库
						Integer checkedcurrent = A.getCheckedcurrent();
						checkedcurrent--;
						A.setCheckedcurrent(checkedcurrent);
						activityService.updateActivityById(A);
						
			            //通过活动id 用户id查p
						partyattend P = activityService.getPtAtdBy2(A.getId(), u.getId());
					    activityService.delPtAtdById(P.getId());
					  //回写参数
					    attr.addAttribute("id", id);
						return "redirect:toryda4";
					}
	              //我来帮
				   @RequestMapping("/wolaibang")
					public String test17(@RequestParam("id")String id,HttpServletRequest req,RedirectAttributes attr){
					   //从seesion中读取user和该artical
					     HttpSession session = req.getSession();  
					     user u = (user) session.getAttribute("user");
					     //新建ptddreamsolve
					     ptdreamsolve P =new ptdreamsolve();
			             P.setDreamid(Integer.parseInt(id));
			             P.setUserid(u.getId());
			             P.setLocatedid(u.getLocatedid());
			           //获取当前日期,并写入时间
					     Date date = new Date();
						  P.setSolvedate(date);
			             dreamService.insertptds(P);
			             
			             
			             attr.addAttribute("id", id);
						return "redirect:toryda7";
					}
			   
	
}
