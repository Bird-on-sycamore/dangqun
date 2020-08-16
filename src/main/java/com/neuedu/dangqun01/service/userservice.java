package com.neuedu.dangqun01.service;

import java.util.List;

import com.neuedu.dangqun01.entity.user;

public interface userservice {
 
	 int adduser(user u) ;//demo测试，无用
	 
	 int login(String telephone,String password);// 0:群众  1：党员  2：基层单位  3：登录失败 
	 
	 user selectuser(String telephone); //通过手机号找人
	 
	 int addNewUser(user u); //注册
	 
	 user selectUserById(Integer id );//通过用户id查用户
	 
	 List<user>selectdangyuanbang(Integer locatedid);//街道获取该地区党员榜单
	 
	 int updateByPrimaryKey(user record);//调用 积分变更反写
}
