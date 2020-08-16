package com.neuedu.dangqun01.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.neuedu.dangqun01.service.locatedservice;
import com.neuedu.dangqun01.service.userservice;
import com.neuedu.dangqun01.entity.located;
import com.neuedu.dangqun01.entity.user;

@Controller
public class logincontroller {
	@Autowired
	userservice userService;
	@Autowired
	locatedservice locatedService;
	//demo内容，不要误用
	@RequestMapping("/tozhuce")
	public String test1(){
		return "demo";
	}
	
	@RequestMapping("/registerdemo")
	public String test77(user u ,Model m,HttpServletRequest req) throws Exception{
		System.out.println(u.getUsername()+u.getPassword());
	
		 userService.adduser(u);
				HttpSession session = req.getSession();
				session.setAttribute("user",u);
				return "welcome";
	}
   //登录
    @RequestMapping("/login")
public String test72(user u ,Model m,HttpServletRequest req) throws Exception{
	//System.out.println(u.getTelephone()+u.getPassword());
	int i = userService.login(u.getTelephone(), u.getPassword());
	//增加一条用户
	user u2 = userService.selectuser(u.getTelephone());
	//0群众 1党员 2基层单位 3失败
	if (i==3) {
		m.addAttribute("errorMsg", "您输入的用户名或者密码有误" );
		return "index";
	} else  if(i==0){                   //
		HttpSession session = req.getSession();
		session.setAttribute("user",u2);//将user放入session
		return"redirect:toryne1";//
		}
	  else if(i==1) {
		  HttpSession session = req.getSession();
			session.setAttribute("user",u2);
			return"redirect:toryne1";
	  }
	  else if(i==2){
		  HttpSession session = req.getSession();
			session.setAttribute("user",u2);
			return"redirect:tojcindex";
	  }
	return null;
	
 }
    //注册逻辑
   @RequestMapping("/register")
	public String test88(user u ,located L,Model m,HttpServletRequest req) throws Exception{
		System.out.println(u.getUsername()+u.getPassword()+u.getTelephone()+u.getRole());
		System.out.println(L.getProvince()+L.getCity()+L.getDistrict()+L.getAreaname());	
		 if(u.getRole()==2) {
			 //将用户名写入地点中的areaname
			 L.setAreaname(u.getUsername());
			 //增加一条地点
			 locatedService.addNewLocated(L);
			 //新建文件夹
			//图片服务器路径  
	    	 String file_path = "D:\\Eclipse EE\\dangqun01\\src\\main\\resources\\static\\storeimg\\"+L.getProvince()+"\\"+L.getCity()+"\\"+L.getDistrict()+"\\"+L.getAreaname()+"\\";  
	    	 new File(file_path).mkdirs();
	    	 //回查地点id并输入
			 located L2 = locatedService.getLocatedAByAll(L.getProvince(), L.getDistrict(), L.getCity(), L.getAreaname());
             u.setLocatedid(L2.getId());
            //增加一条用户
             userService.addNewUser(u);
             //u无id所以需要从数据库中查出完整信息u2
             user u2 =userService.selectuser(u.getTelephone());
             HttpSession session = req.getSession();
			 session.setAttribute("user",u2);
			 return"redirect:tojcindex";
		 }
		 else {
			 //个人用户的注册操作
			 HttpSession session = req.getSession();
			 located L2 = locatedService.getLocatedAByAll(L.getProvince(), L.getDistrict(), L.getCity(), L.getAreaname());
			 u.setLocatedid(L2.getId());
			 userService.addNewUser(u);
			  //u无id所以需要从数据库中查出完整信息u2
             user u2 =userService.selectuser(u.getTelephone());
			 session.setAttribute("user",u2);
			 if(u.getRole()==0)
			 return"redirect:toryne1";
			 else
			 return"redirect:toryne1";
		 }
	}
   
   //用户注册过程中显示该地区街道的ajax
   @RequestMapping("/chajiedao")
   @ResponseBody
	public Map test1(@RequestBody located L){
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		System.out.println(L.getDistrict());
		//查出所有符合条件的街道
		List<located> list = locatedService.getLocatedList(L.getProvince(), L.getDistrict(), L.getCity());
		//int j =list.size();
		//System.out.println(j);
		//建立字符串链表存储街道名信息
		ArrayList<String> list2=new ArrayList<String>();
		//List<String> list2 = null;
		for(int i=0;i<list.size();i++) {
		    located L2 = list.get(i);
			list2.add(L2.getAreaname());
		}
		map.put("areaname", list2);
		return map;
	}
   //用户注册过程中检查手机号/单位编号重复的ajax
   @RequestMapping("/chadianhua")
   @ResponseBody
	public Map test2(@RequestBody user u){
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		System.out.println(u.getTelephone());
		//查出所有电话的个人/单位
	    user u2 =userService.selectuser(u.getTelephone());
	   //查到相同telephone的返回0，不同返回1
	    if(u2 == null)
		map.put("flag",1 );
	   else
		map.put("flag",0 );
		return map;
	}
}

