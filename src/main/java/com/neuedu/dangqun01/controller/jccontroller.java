package com.neuedu.dangqun01.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.method.annotation.RedirectAttributesMethodArgumentResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.neuedu.dangqun01.entity.activity;
import com.neuedu.dangqun01.entity.advice;
import com.neuedu.dangqun01.entity.artical;
import com.neuedu.dangqun01.entity.dream;
import com.neuedu.dangqun01.entity.located;
import com.neuedu.dangqun01.entity.partyattend;
import com.neuedu.dangqun01.entity.user;
import com.neuedu.dangqun01.service.activityservice;
import com.neuedu.dangqun01.service.adviceservice;
import com.neuedu.dangqun01.service.articalservice;
import com.neuedu.dangqun01.service.dreamservice;
import com.neuedu.dangqun01.service.locatedservice;
import com.neuedu.dangqun01.service.userservice;

@Controller
public class jccontroller {
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
	//文章部分
	//新建文章表单
	   @RequestMapping("/addartical")
		public String test1(HttpServletRequest req) throws Exception{
		    
		 //从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		 //用locatedid转化为实际信息
		     located L = locatedService.getlocatedById(u.getLocatedid()); 
		   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
		    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		    // 获取表单参数，不是string需要转换
		    String title = multipartRequest.getParameter("title");
		    int kind =  Integer.parseInt(multipartRequest.getParameter("kind"));
		    int point =  Integer.parseInt(multipartRequest.getParameter("point"));
		    String description = multipartRequest.getParameter("description");
		    String content = multipartRequest.getParameter("content");
		    artical A = new artical();
		    
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
	            A.setTitle(title);
	            A.setKind(kind);
	            A.setPoint(point);
	            A.setDescription(description);
	            A.setContent(content);
		    } 
		     //获取当前日期,并写入发表时间
		     Date date = new Date();
		     A.setDate(date);
		     //提取user的locatedid到artical
		     //System.out.println(u.getLocatedid());
		     A.setLocatedid(u.getLocatedid());
		     articalService.addNewArtical(A);
		   return "redirect:tojcne1";
		}
	   
	   
	   //修改文章表单
	   @RequestMapping("/updateartical")
		public String test2(HttpServletRequest req) throws Exception{
		    
		 //从seesion中读取user和该artical
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     artical A = (artical) session.getAttribute("artical");
		 //用locatedid转化为实际信息
		     located L = locatedService.getlocatedById(u.getLocatedid()); 
		   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
		    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		    // 获取表单参数，不是string需要转换
		    String title = multipartRequest.getParameter("title");
		    int kind =  Integer.parseInt(multipartRequest.getParameter("kind"));
		    int point =  Integer.parseInt(multipartRequest.getParameter("point"));
		    String description = multipartRequest.getParameter("description");
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
	            A.setTitle(title);
	            A.setKind(kind);
	            A.setPoint(point);
	            A.setDescription(description);
	            A.setContent(content);
		    } 
		     articalService.updateArticalById(A);
		   return "redirect:tojcne1";
		}
	   
	   
	   //按钮删除文章
	   @RequestMapping("/delartical")
		public String test3(@RequestParam("id")String id,HttpServletRequest req){
			//从news1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
			artical A = articalService.getArticalById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			 //删除图片文件
		    String file_path3 ="D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\"+A.getImgpath();
		    File file2 = new File(file_path3);
		    file2.delete();
		    //在数据库进行删除
			articalService.delArticalById(Integer.parseInt(id));
			return "redirect:tojcne1";
		}
	   
	   
	   
	   //活动部分
	   //新建活动表单
	   @RequestMapping("/addactivity")
		public String test11(HttpServletRequest req) throws Exception{
		    
		 //从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		 //用locatedid转化为实际信息
		     located L = locatedService.getlocatedById(u.getLocatedid()); 
		   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
		    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		    // 获取表单参数，不是string需要转换
		    String name = multipartRequest.getParameter("name");
		    int kind =  Integer.parseInt(multipartRequest.getParameter("kind"));
		    int point =  Integer.parseInt(multipartRequest.getParameter("point"));
		    String description = multipartRequest.getParameter("description");
		    String content = multipartRequest.getParameter("content");
		    int checkedmax =  Integer.parseInt(multipartRequest.getParameter("checkedmax"));
		    //设置格式sdf2将string转化为date格式
		    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    System.out.println(multipartRequest.getParameter("endtime"));
		    Date endtime = sdf2.parse(multipartRequest.getParameter("endtime"));
		    Date holdtime = sdf2.parse(multipartRequest.getParameter("holdtime"));
		    activity A = new activity();
		    
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
	            A.setKind(kind);
	            A.setPoint(point);
	            A.setDescription(description);
	            A.setContent(content);
	            A.setCheckedmax(checkedmax);
	            A.setEndtime(endtime);
	            A.setHoldtime(holdtime);
		    } 
		     //获取当前日期,并写入发表时间
		     Date date = new Date();
		     A.setDate(date);
		     //提取user的locatedid到artical
		     //System.out.println(u.getLocatedid());
		     A.setLocatedid(u.getLocatedid());
		     activityService.addNewActivity(A);
		   return "redirect:tojcac1";
		}
	   
	   
	 //修改活动表单
	   @RequestMapping("/updateactivity")
		public String test12(HttpServletRequest req) throws Exception{
		    
		 //从seesion中读取user和该activity
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     activity A = (activity) session.getAttribute("activity");
		 //用locatedid转化为实际信息
		     located L = locatedService.getlocatedById(u.getLocatedid()); 
		   //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
		    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		    // 获取表单参数，不是string需要转换
		    String name = multipartRequest.getParameter("name");
		    int kind =  Integer.parseInt(multipartRequest.getParameter("kind"));
		    int point =  Integer.parseInt(multipartRequest.getParameter("point"));
		    String description = multipartRequest.getParameter("description");
		    String content = multipartRequest.getParameter("content");
		    int checkedmax =  Integer.parseInt(multipartRequest.getParameter("checkedmax"));
		    
		    //设置格式sdf2将string转化为date格式
		    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    System.out.println(multipartRequest.getParameter("endtime"));
		    Date endtime = sdf2.parse(multipartRequest.getParameter("endtime"));
		    Date holdtime = sdf2.parse(multipartRequest.getParameter("holdtime"));
		    
		    
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
		            A.setKind(kind);
		            A.setPoint(point);
		            A.setDescription(description);
		            A.setContent(content);
		            A.setCheckedmax(checkedmax);
		            A.setEndtime(endtime);
		            A.setHoldtime(holdtime);
		            A.setCheckedcurrent(0);
		    } 
		     activityService.updateActivityById(A);
		   return "redirect:tojcac1";
		}
	   
	 //按钮删除活动
	   @RequestMapping("/delactivity")
		public String test13(@RequestParam("id")String id,HttpServletRequest req){
			//从news1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			 //删除图片文件
		    String file_path3 ="D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\"+A.getImgpath();
		    File file2 = new File(file_path3);
		    file2.delete();
		    //在数据库进行删除
			activityService.delActivityById(Integer.parseInt(id));
			return "redirect:tojcac1";
		}
	   
	   //按钮人员已参与
	   @RequestMapping("/yicanyu")
		public String test14(@RequestParam("i")String i,HttpServletRequest req,RedirectAttributes attr){
			
		 //从session中获取活动id用于返回act4
			 HttpSession session = req.getSession();  
		     activity A = (activity) session.getAttribute("activity");
		   //从act4按下已参与按钮后得到了值id(该ptd的id)，并根据id的值查询该ptd
			partyattend P = activityService.getPtAtdById(Integer.parseInt(i));//Integer.parseInt将String转化为int
			if(P.getAttend()==0) {
			//修改attend为1
			P.setAttend(1);
			//更新回数据库
			activityService.updatePtAtdById(P);
			//党员积分
			if(A.getKind()!=0) {
				//此处应该从活动中取党员id
				user u = userService.selectUserById(P.getUserid());  
				//加分
				Float point = u.getPoint();
				point = point+A.getPoint();
				u.setPoint(point);
				//数据库回写
				userService.updateByPrimaryKey(u);
			}
			}
		     String id2 = Integer.toString(A.getId());
		     //RedirectAttributes 给重定向参数赋值
		      //System.out.println(id2);
		      attr.addAttribute("id", id2);
			return "redirect:tojcac4";
		}
	   
	 //按钮人员已参与
	   @RequestMapping("/shancanyu")
		public String test15(@RequestParam("i")String i,HttpServletRequest req,RedirectAttributes attr){
			//从act4按下已参与按钮后得到了值id(该ptd的id)，并根据id的值查询该ptd
			partyattend P = activityService.getPtAtdById(Integer.parseInt(i));//Integer.parseInt将String转化为int
			//更新回数据库
			activityService.delPtAtdById(P.getId());
			//从session中获取活动id用于返回act4
			 HttpSession session = req.getSession();  
		     activity A = (activity) session.getAttribute("activity");
		     String id2 = Integer.toString(A.getId());
		     //RedirectAttributes 给重定向参数赋值
		      //System.out.println(id2);
		      attr.addAttribute("id", id2);
			return "redirect:tojcac4"; 
		}
	   
	   
	   //建议部分
	   //提交建议回复内容
	   @RequestMapping("/addadvicereply")
	   public String test21(advice a ,HttpServletRequest req) throws Exception{
		   //从session中取到该建议
		   HttpSession session = req.getSession();
		   advice A  = (advice)session.getAttribute("advice");
	   	   //将界面中的回复添加到对象A中
		   A.setBack03(a.getBack03());
		   //数据库回写
		   adviceService.updateAdviceById(A);
	   	return "redirect:tojcad1";
	   	
	    }
	   
	   
	 //心愿部分
	 //提交心愿审核内容
	   @RequestMapping("/shenhedream")
	   public String test31(dream d ,HttpServletRequest req) throws Exception{
		   //从session中取到该愿望
		   HttpSession session = req.getSession();
		   dream D  = (dream)session.getAttribute("dream");
	   	   //将界面中的回复添加到对象D中
		   D.setAdopted(d.getAdopted());
		   D.setPoint(d.getPoint());
		   //数据库回写
		   dreamService.updateDreamById(D);
	   	return "redirect:tojcdr1";
	   	
	    }
	   
	   
}
