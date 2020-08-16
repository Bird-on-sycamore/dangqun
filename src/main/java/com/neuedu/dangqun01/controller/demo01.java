package com.neuedu.dangqun01.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.neuedu.dangqun01.dao.dreamMapper;
import com.neuedu.dangqun01.entity.activity;
import com.neuedu.dangqun01.entity.advice;
import com.neuedu.dangqun01.entity.artical;
import com.neuedu.dangqun01.entity.dream;
import com.neuedu.dangqun01.entity.partyattend;
import com.neuedu.dangqun01.entity.ptdreamsolve;
import com.neuedu.dangqun01.entity.ptread;
import com.neuedu.dangqun01.entity.user;
import com.neuedu.dangqun01.service.activityservice;
import com.neuedu.dangqun01.service.adviceservice;
import com.neuedu.dangqun01.service.articalservice;
import com.neuedu.dangqun01.service.dreamservice;
import com.neuedu.dangqun01.service.locatedservice;
import com.neuedu.dangqun01.service.userservice;

@Controller
public class demo01 {
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
	/***
	 * 当访问localhost:8080/dangqun01/hello时执行该方法
	 * 
	 * **/
	//页面跳转； 不带数据的跳转
		@RequestMapping("/toindex")
		public String test1(HttpServletRequest req){
			 HttpSession session = req.getSession();
			 session.invalidate();
			return "index";
		}
		@RequestMapping("/toregister")
		public String test2(){
			return "register";
		}
		
		
		//基层端的界面跳转
		@RequestMapping("/tojcindex")
		public String test3(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //通过locatedid找活动列表
		     List<activity> activityList = activityService.getActivityList(u.getLocatedid());
		     //将活动列表注入session
	    	 session.setAttribute("activityList", activityList);
	    	 //通过locatedid找建议列表
		     List<advice> adviceList = adviceService.getAdviceList(u.getLocatedid());
		   //将建议列表注入session
	    	 session.setAttribute("adviceList", adviceList);
	    	 //通过locatedid找建议列表
		     List<dream> dreamlist = dreamService.getDreamList(u.getLocatedid());
		     //将建议列表注入session
	    	 session.setAttribute("dreamlist", dreamlist);
	    	  List<artical> articalList = articalService.getArticalList(u.getLocatedid());
			  session.setAttribute("articallist",articalList);//将文章列表注入session
			  //党员榜单
			  List<user> dangyuanlist = userService.selectdangyuanbang(u.getLocatedid());
			  session.setAttribute("dangyuanlist",dangyuanlist);//将党员列表注入session
			return "jiceng/index";
		}
		@RequestMapping("/tojcac1")
		public String test4(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //通过locatedid找活动列表
		     List<activity> activityList = activityService.getActivityList(u.getLocatedid());
		     //将back03征用存储活动状态
		     for(int i=0;i<activityList.size();i++) {
		    	 activity A = activityList.get(i);
		    	 System.out.println(A.getName());
		    	 Date endtime =A.getEndtime();
		    	 Date holdtime =A.getHoldtime();
		    	 //当前时间
		    	 Date now = new Date();
		    	 if(endtime.after(now)) {
		    		 //表示截止时间晚于当前时间
		    		 A.setBack03("未截止");
		    	 }
		    	 else if(holdtime.after(now)) {
		    		 //表示举办时间晚于当前时间
		    		 A.setBack03("已截止");
		    	 }
		    	 else {
		    		 A.setBack03("已举办");
		    	 }
		    	 //回传
		    	 activityList.set(i, A);
		     }
		   //将文章列表注入session
	    	 session.setAttribute("activityList", activityList);
			return "jiceng/activity1";
		}
		@RequestMapping("/tojcac2")
		public String test5(){
			return "jiceng/activity2";
		}
		@RequestMapping("/tojcac3")
		public String test6(@RequestParam("id")String id,HttpServletRequest req){
			//从activity1按下编辑按钮后得到了值id(该块活动的id)，并根据id的值查询该activity
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该活动注入session 
			HttpSession session = req.getSession();
			 session.setAttribute("activity",A);
			return "jiceng/activity3";
		}
		@RequestMapping("/tojcac4")
		public String test7(@RequestParam( value = "id",required = false)String id,HttpServletRequest req){
			//从activity1按下编辑按钮后得到了值id(该块活动的id)，并根据id的值查询该activity
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//从activity1按下人员按钮后得到了值id(该块活动的id)，并根据id的值查询人员列表
			List<partyattend> ptAtdList = activityService.getPtAtdList(Integer.parseInt(id));
			 for(int i=0;i<ptAtdList.size();i++) {
				 partyattend P = ptAtdList.get(i);
				 //根据用户id查用户
				 user u = userService.selectUserById(P.getUserid());
				 //把用户的角色，姓名，电话注入ptd中
				 P.setBack01(u.getRole());
				 P.setBack03(u.getUsername());
				 P.setBack04(u.getTelephone());
				 //回传
				 ptAtdList.set(i, P);
			 }
			 //将人员参与列表注入session
			 HttpSession session = req.getSession(); 
	    	 session.setAttribute("ptAtdList", ptAtdList); 
	    	 //将该活动注入session
	    	 session.setAttribute("activity",A);
			return "jiceng/activity4";
		}
		
		@RequestMapping("/tojcad1")
		public String test8(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //通过locatedid找建议列表
		     List<advice> adviceList = adviceService.getAdviceList(u.getLocatedid());
		     //将back03征用存储活动状态
		     for(int i=0;i<adviceList.size();i++) {
		    	 advice A = adviceList.get(i);
		    	//根据用户id查用户
				 user u2 = userService.selectUserById(A.getUserid());
				/* //把用户的姓名，电话注入advice中
				 A.setBack03(u2.getUsername());
				 A.setBack04(u2.getTelephone());*/
				 
				 //由于数据库mybatis导入时漏了reply，所以back03变成reply
				 //现将姓名，电话字符串拼接注入advice中
				 String mix =u2.getUsername()+"-"+u2.getTelephone();
				 A.setBack04(mix);
		    	 //回传
		    	 adviceList.set(i, A);
		     }
		   //将建议列表注入session
	    	 session.setAttribute("adviceList", adviceList);
			return "jiceng/advice1";
		}
		@RequestMapping("/tojcad2")
		public String test9(@RequestParam("id")String id,HttpServletRequest req){
			//从advice1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该advice
			advice A = adviceService.selectAdviceById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该建议注入session
			HttpSession session = req.getSession();
			 session.setAttribute("advice",A);
			 //为了方便显示，同时加入 提建议的user
			 user u = userService.selectUserById(A.getUserid());
			 session.setAttribute("aduser",u);
			return "jiceng/advice2";
		}
		@RequestMapping("/tojcdr1")
		public String test10(HttpServletRequest req){
			
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //通过locatedid找建议列表
		     List<dream> dreamlist = dreamService.getDreamList(u.getLocatedid());
		     //将back03征用存储活动状态
		     for(int i=0;i<dreamlist.size();i++) {
		    	 dream D = dreamlist.get(i);
		    	//根据用户id查用户
				 user u2 = userService.selectUserById(D.getUseid());
				/* //把用户的姓名，电话注入advice中
				 A.setBack03(u2.getUsername());
				 A.setBack04(u2.getTelephone());*/
				 
				 //由于数据库mybatis导入时漏了reply，所以back03变成reply
				 //现将姓名，电话字符串拼接注入advice中
				 String mix =u2.getUsername()+"-"+u2.getTelephone();
				 D.setBack04(mix);
		    	 //回传
				 dreamlist.set(i, D);
		     }
		   //将建议列表注入session
	    	 session.setAttribute("dreamlist", dreamlist);
			
			return "jiceng/dream1";
		}
		@RequestMapping("/tojcdr2")
		public String test11(@RequestParam("id")String id,HttpServletRequest req){
			//从dream1按下编辑按钮后得到了值id(该块心愿的id)，并根据id的值查询该dream
			dream D = dreamService.selectDreamById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该心愿注入session
			HttpSession session = req.getSession();
			 session.setAttribute("dream",D);
			 //为了方便显示，同时加入 提建议的user
			 user u = userService.selectUserById(D.getUseid());
			 session.setAttribute("druser",u);
			return "jiceng/dream2";
		}
		@RequestMapping("/tojcne1")
		public String test12(HttpServletRequest req){
			//在进入news1之前需要把该地区的news数组写入session 
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     List<artical> articalList = articalService.getArticalList(u.getLocatedid());
		     session.setAttribute("articallist",articalList);//将文章列表注入session
			return "jiceng/news1";
		}
		@RequestMapping("/tojcne2")
		public String test13(){
			return "jiceng/news2";
		}
		@RequestMapping("/tojcne3")
		public String test14(@RequestParam("id")String id,HttpServletRequest req){
			//从news1按下编辑按钮后得到了值id(该块文章的id)，并根据id的值查询该artical
			artical A = articalService.getArticalById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该文章注入session 
			HttpSession session = req.getSession();
			 session.setAttribute("artical",A);
			return "jiceng/news3";
		}
		//	@RequestMapping不具有参数，就是首页
		/*		@RequestMapping
				public String test2 (){
					return "index";
				}	*/
		
	   
		
		//人员端界面进入
		//普通新闻(外面)
		@RequestMapping("/toryne1")
		public String test15(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取出该地区的新闻
		     List<artical> articalList = articalService.getArticalList(u.getLocatedid());
		     //建立新数组存储普通新闻
		     ArrayList<artical> ptxw=new ArrayList<artical>();
		     for(int i=0;i<articalList.size();i++) {
		    	 artical A = articalList.get(i);
				 //判断类型
		    	 if(A.getKind() == 1) 
		    		ptxw.add(A);
			 }
			  session.setAttribute("ptxw",ptxw);//将文章列表注入session
			return "renyuan/news1";
		}
		//便民通告(外面)
		@RequestMapping("/toryne2")
		public String test16(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取出该地区的新闻
		     List<artical> articalList = articalService.getArticalList(u.getLocatedid());
		     //建立新数组存储普通新闻
		     ArrayList<artical> bmtg=new ArrayList<artical>();
		     for(int i=0;i<articalList.size();i++) {
		    	 artical A = articalList.get(i);
				 //判断类型
		    	 if(A.getKind() == 3) 
		    		 bmtg.add(A);
			 }
			  session.setAttribute("bmtg",bmtg);//将文章列表注入session
			return "renyuan/news2";
		}
		//日常速记(外面)
		@RequestMapping("/toryne3")
		public String test17(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取出该地区的新闻
		     List<artical> articalList = articalService.getArticalList(u.getLocatedid());
		     //建立新数组存储普通新闻
		     ArrayList<artical> rcsj=new ArrayList<artical>();
		     for(int i=0;i<articalList.size();i++) {
		    	 artical A = articalList.get(i);
				 //判断类型
		    	 if(A.getKind() == 4) 
		    		 rcsj.add(A);
			 }
			  session.setAttribute("rcsj",rcsj);//将文章列表注入session
			return "renyuan/news3";
		}
		//普通新闻(里面)
		@RequestMapping("/toryne4")
		public String test18(@RequestParam("id")String id,HttpServletRequest req){
			//从news1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该artical
			artical A = articalService.getArticalById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该建议注入session
			HttpSession session = req.getSession();
			 session.setAttribute("news",A);
			return "renyuan/news4";
		}
		//便民通告(里面)
		@RequestMapping("/toryne5")
		public String test19(@RequestParam("id")String id,HttpServletRequest req){
			//从news1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该artical
			artical A = articalService.getArticalById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该建议注入session
			HttpSession session = req.getSession();
			 session.setAttribute("news",A);
			return "renyuan/news5";
		}
		//日常速记(里面)
		@RequestMapping("/toryne6")
		public String test20(@RequestParam("id")String id,HttpServletRequest req){
			//从news1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该artical
			artical A = articalService.getArticalById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该建议注入session
			HttpSession session = req.getSession();
			 session.setAttribute("news",A);
			return "renyuan/news6";
		}
		//活动列表
		@RequestMapping("/toryac1")
		public String test21(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取出该地区的新闻
		     List<activity> activityList = activityService.getActivityList(u.getLocatedid());
		     ArrayList<activity> ac2=new ArrayList<activity>();//输出的活动list
		     for(int i=0;i<activityList.size();i++) {
		    	 //根据各种状态确定该活动的状态，并存储在back01 0未报名  1未参与 2已参与 
		    	 activity A = activityList.get(i);
		    	 if(A.getKind()==0) {//判断是否为群众活动
		    	 //根据该活动id查用户报名参与
		    	 int zt = 0;//状态 0未报名 1未参与 2已参与
		    	 List<partyattend> ptAtdList = activityService.getPtAtdList(A.getId());
                 //找到该用户则zt设为1
		    	 for(int j=0;j<ptAtdList.size();j++) {
                	 partyattend p = ptAtdList.get(j);
                	 //System.out.println(p.getId());
                	 if(u.getId()==p.getUserid()) { 
                		 //再通过里面的参与与否进行进一步判断
                		 if(p.getAttend()==1)
                		 zt=2;
                		 else
                	     zt=1;
                	 }
                 }
		    	 //将状态写入back01
                 A.setBack01(zt);
                 //获取当前时间以及截止时间
                 Date d1 =new Date();
                 Date d2 =A.getEndtime();
                 if(zt!=0||(d2.after(d1)&&A.getCheckedmax()!=A.getCheckedcurrent())) {
                	 //当超过截止时间或者人数到达上限时，不予显示(zt=0时)
                	 ac2.add(A);
                 }
		    	 }
		     }
			  session.setAttribute("ac2",ac2);//将文章列表注入session
			
			return "renyuan/activity1";
		}

		@RequestMapping("/toryac2")
		public String test22(@RequestParam("id")String id,HttpServletRequest req){
			 //从activty1按下链接后得到了值id(该块活动的id)，并根据id的值查询该activty
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     
		     //跳转时要将状态back01写入
		     int zt = 0;//状态 0未报名 1未参与 2已参与
	    	 List<partyattend> ptAtdList = activityService.getPtAtdList(A.getId());
             //找到该用户则zt设为1
	    	 for(int j=0;j<ptAtdList.size();j++) {
            	 partyattend p = ptAtdList.get(j);
            	 //System.out.println(p.getId());
            	 if(u.getId()==p.getUserid()) { 
            		 //再通过里面的参与与否进行进一步判断
            		 if(p.getAttend()==1)
            		 zt=2;
            		 else
            	     zt=1;
            	 }
             }
	    	 //将状态写入back01
             A.setBack01(zt);
		     
			//将该活动注入session
			 session.setAttribute("activty",A);
			return "renyuan/activity2";
		}
		//建议部分
		//建议列表
		@RequestMapping("/toryad1")
		public String test23(HttpServletRequest req){
			
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
			 List<advice> list = adviceService.getAdviceListByUser(u.getId());
			//将建议列表注入session
	    	 session.setAttribute("adviceList", list);
			return "renyuan/advice1";
		}
		//建议新建界面
		@RequestMapping("/toryad2")
		public String test24(){
			return "renyuan/advice2";
		}
		//建议编辑界面
		@RequestMapping("/toryad3")
		public String test25(@RequestParam("id")String id,HttpServletRequest req){
			//从advice1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该advice
			advice  A = adviceService.selectAdviceById(Integer.parseInt(id));
			//Integer.parseInt将String转化为int
			//将该文章注入session 
			HttpSession session = req.getSession();
			 session.setAttribute("advice",A);
			return "renyuan/advice3";
		}
		//建议查看界面
		@RequestMapping("/toryad4")
		public String test26(@RequestParam("id")String id,HttpServletRequest req){
			//从advice1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该advice
			advice A = adviceService.selectAdviceById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该建议注入session
			HttpSession session = req.getSession();
			 session.setAttribute("advice",A);
			return "renyuan/advice4";
		}
		@RequestMapping("/torydr1")
		public String test27(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取我的心愿
		     List<dream> dreamList = dreamService.getDreamListByuseid(u.getId());
		     for(int i=0;i<dreamList.size();i++) {
		    	 //根据各种状态确定该心愿的状态，并存储在back01 0未审核  1已驳回 2未接收 3已接收 4已完成 (未完成直接转化为未接收)
		    	 dream D = dreamList.get(i);
		    	 int zt = 0;//状态 0未审核  1已驳回 2未接收 3已接收 4已完成 
		    	 //通过活动id找参与
		    	 ptdreamsolve P = dreamService.getPtdsBydreamid(D.getId());
                 if(D.getAdopted()==0) {
                	  zt=0;
                 }     
                 else if(D.getAdopted()==1) {
                	  zt=1;
                 }
                 else {
                	 if(P==null) zt=2;
                	 else {
                		 if(D.getSolved()==0) zt=3;
                		 else  zt=4;
                	 }
                 }
		    	 //将状态写入back01
                D.setBack01(zt);
                dreamList.set(i, D);
		     }
			  session.setAttribute("dreamList",dreamList);//将文章列表注入session
			return "renyuan/dream1";
		}
		@RequestMapping("/torydr2")
		public String test28(){
			return "renyuan/dream2";
		}
		@RequestMapping("/torydr3")
		public String test29(@RequestParam("id")String id,HttpServletRequest req){
			//从dream1按下编辑按钮后得到了值id(该块愿望的id)，并根据id的值查询该dream
			dream D = dreamService.selectDreamById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将该建议注入session
			HttpSession session = req.getSession();
			 session.setAttribute("dream",D);
			return "renyuan/dream3";
		}
		@RequestMapping("/torydr4")
		public String test30(@RequestParam("id")String id,HttpServletRequest req){
			HttpSession session = req.getSession();
			//从dream1按下编辑按钮后得到了值id(该块愿望的id)，并根据id的值查询该dream
			dream D = dreamService.selectDreamById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将状态写入back01 
			int zt = 0;//状态 0未审核  1已驳回 2未接收 3已接收 4已完成 
	    	 //通过活动id找参与
	    	 ptdreamsolve P = dreamService.getPtdsBydreamid(D.getId());
             if(D.getAdopted()==0) {
            	  zt=0;
             }     
             else if(D.getAdopted()==1) {
            	  zt=1;
             }
             else {
            	 if(P==null) zt=2;
            	 else {
            		 //通过id找党员，并将该党员的姓名-电话写入back03 back04
            		   user u2 = userService.selectUserById(P.getUserid());
            		   D.setBack03(u2.getUsername());
            		   D.setBack04(u2.getTelephone());
            		   session.setAttribute("ptds",P);
            		 if(D.getSolved()==0) zt=3;
            		 else  zt=4;
            	 }
             }
	    	 //将状态写入back01
            D.setBack01(zt);
          //将该建议注入session
			session.setAttribute("dream",D);
			return "renyuan/dream4";
		}
		//党员专区
		//积分
		@RequestMapping("/toryda1")
		public String test31(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //数据库回写前端分数
		     user u2 = userService.selectUserById(u.getId());
		     session.setAttribute("user",u2);
			  //党员榜单
			  List<user> dangyuanlist = userService.selectdangyuanbang(u.getLocatedid());
			  session.setAttribute("dangyuanlist",dangyuanlist);//将党员列表注入session
			return "renyuan/dang1";
		}
		//党建文章
		@RequestMapping("/toryda2")
		public String test32(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取出该地区的新闻
		     List<artical> articalList = articalService.getArticalList(u.getLocatedid());
		     //建立新数组存储普通新闻
		     ArrayList<artical> djwz=new ArrayList<artical>();
		     for(int i=0;i<articalList.size();i++) {
		    	 artical A = articalList.get(i);
				 //判断类型
		    	 if(A.getKind() == 2) 
		    		 djwz.add(A);
			 }
			  session.setAttribute("djwz",djwz);//将文章列表注入session
			return "renyuan/dang2";
		}
		//党建学习查看文章
		@RequestMapping("/toryda3")
		public String test33(@RequestParam("id")String id,HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
			//从news1按下编辑按钮后得到了值id(该块建议的id)，并根据id的值查询该artical
			artical A = articalService.getArticalById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//党建积分
			ptread ptread = articalService.getptread(u.getId(), A.getId());
			//如果未查找到阅览记录，则新增一条并予以加分
			if(ptread==null) {
				ptread 	P2 = new  ptread();
				P2.setUserid(u.getId());
				P2.setArticalid(A.getId());
				//获取当前日期,并写入时间
			     Date date = new Date();
				P2.setDate(date);
				articalService.insertptread(P2);
				//加分
				Float point = u.getPoint();
				point = point+A.getPoint();
				u.setPoint(point);
				//数据库回写
				userService.updateByPrimaryKey(u);
			}
			
			//将该建议注入session
			 session.setAttribute("news",A);
			return "renyuan/dang3";
		}
		//党员活动
		@RequestMapping("/toryda4")
		public String test34(HttpServletRequest req){
			
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取出该地区的新闻
		     List<activity> activityList = activityService.getActivityList(u.getLocatedid());
		     ArrayList<activity> ac2=new ArrayList<activity>();//输出的活动list
		     for(int i=0;i<activityList.size();i++) {
		    	 //根据各种状态确定该活动的状态，并存储在back01 0未报名  1未参与 2已参与 
		    	 activity A = activityList.get(i);
		    	 if(A.getKind()!=0) {//判断是否为党员活动
		    	 //根据该活动id查用户报名参与
		    	 int zt = 0;//状态 0未报名 1未参与 2已参与
		    	 List<partyattend> ptAtdList = activityService.getPtAtdList(A.getId());
                //找到该用户则zt设为1
		    	 for(int j=0;j<ptAtdList.size();j++) {
               	 partyattend p = ptAtdList.get(j);
               	 //System.out.println(p.getId());
               	 if(u.getId()==p.getUserid()) { 
               		 //再通过里面的参与与否进行进一步判断
               		 if(p.getAttend()==1)
               		 zt=2;
               		 else
               	     zt=1;
               	 }
                }
		    	 //将状态写入back01
                A.setBack01(zt);
                //获取当前时间以及截止时间
                Date d1 =new Date();
                Date d2 =A.getEndtime();
                if(zt!=0||(d2.after(d1)&&A.getCheckedmax()!=A.getCheckedcurrent())) {
               	 //当超过截止时间或者人数到达上限时，不予显示(zt=0时)
               	 ac2.add(A);
                }
		    	 }
		     }
			  session.setAttribute("ac2",ac2);//将文章列表注入session
			
			return "renyuan/dang4";
		}
		@RequestMapping("/toryda5")
		public String test35(@RequestParam("id")String id,HttpServletRequest req){
			 //从activty1按下链接后得到了值id(该块活动的id)，并根据id的值查询该activty
			activity A = activityService.getActivityById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     
		     //跳转时要将状态back01写入
		     int zt = 0;//状态 0未报名 1未参与 2已参与
	    	 List<partyattend> ptAtdList = activityService.getPtAtdList(A.getId());
             //找到该用户则zt设为1
	    	 for(int j=0;j<ptAtdList.size();j++) {
            	 partyattend p = ptAtdList.get(j);
            	 //System.out.println(p.getId());
            	 if(u.getId()==p.getUserid()) { 
            		 //再通过里面的参与与否进行进一步判断
            		 if(p.getAttend()==1)
            		 zt=2;
            		 else
            	     zt=1;
            	 }
             }
	    	 //将状态写入back01
             A.setBack01(zt);
		     
			//将该活动注入session
			 session.setAttribute("activty",A);
			return "renyuan/dang5";
		}
		//我来帮
		@RequestMapping("/toryda6")
		public String test36(HttpServletRequest req){
			//从seesion中读取user
		     HttpSession session = req.getSession();  
		     user u = (user) session.getAttribute("user");
		     //取我的心愿
		     List<dream> dreamList = dreamService.getDreamList(u.getLocatedid());
		   //建立新数组存储输出的心愿
		     ArrayList<dream> dreamlist2=new ArrayList<dream>();
		     for(int i=0;i<dreamList.size();i++) {
		    	 //根据各种状态确定该心愿的状态，并存储在back01 0未审核  1已驳回 2未接收 3已接收 4已完成 (未完成直接转化为未接收)
		    	 dream D = dreamList.get(i);
		    	 int zt = 0;//状态 0未审核  1已驳回 2未接收 3已接收 4已完成 
		    	 //通过活动id找参与
		    	 ptdreamsolve P = dreamService.getPtdsBydreamid(D.getId()); 
		    	 //只输出zt=234的部分，未过审的都不予显示
                if(D.getAdopted()==0) {
               	  zt=0;
                }     
                else if(D.getAdopted()==1) {
               	  zt=1;
                }
                else {
               	 if(P==null )//此处必须判断不是本人的心愿 
               		 {
               		   zt=2;
               		 //将状态写入back01
                     D.setBack01(zt);
                     if(D.getUseid()!=u.getId())
                     dreamlist2.add(D);
               		 }
               	 else {
               	     //只需要自己相关的接收
               		 if(P.getUserid().equals(u.getId())) {
               		   if(D.getSolved()==0) zt=3;
               		   else  zt=4;
               		 //将状态写入back01
                       D.setBack01(zt);
                       dreamlist2.add(D);
               	     }
               	 }
                }
		     }
			  session.setAttribute("dreamList",dreamlist2);//将文章列表注入session
			return "renyuan/dang6";
		}
		@RequestMapping("/toryda7")
		public String test37(@RequestParam("id")String id,HttpServletRequest req){
			
			HttpSession session = req.getSession();
			//从dream1按下编辑按钮后得到了值id(该块愿望的id)，并根据id的值查询该dream
			dream D = dreamService.selectDreamById(Integer.parseInt(id));//Integer.parseInt将String转化为int
			//将状态写入back01 
			int zt = 0;//状态 0未审核  1已驳回 2未接收 3已接收 4已完成 
	    	 //通过活动id找参与
	    	 ptdreamsolve P = dreamService.getPtdsBydreamid(D.getId());
              //在之前dang6中已经进行了筛选，无需再次筛选是否过审
            	 if(P==null) zt=2;
            	 else {
            		 //通过id找群众，并将该群众的姓名-电话写入back03 back04
            		   user u2 = userService.selectUserById(D.getUseid());
            		   D.setBack03(u2.getUsername());
            		   D.setBack04(u2.getTelephone());
            		   session.setAttribute("ptds",P);
            		 if(D.getSolved()==0) zt=3;
            		 else  zt=4;
            	 }
             
	    	 //将状态写入back01
            D.setBack01(zt);
          //将该建议注入session
			session.setAttribute("dream",D);
			
			return "renyuan/dang7";
		}
} 
    