package com.neuedu.dangqun01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dangqun01.service.userservice;
import com.neuedu.dangqun01.dao.userMapper;
import com.neuedu.dangqun01.entity.user;
@Service
public class userserviceimpl implements userservice {

	@Autowired
	userMapper userMapper;
	//demo测试，无用
	public int adduser(user u) {
		// TODO Auto-generated method stub
		int i = userMapper.addUser(u);
  		return i;
	}
	// 0:群众  1：党员  2：基层单位  3：登录失败 （登陆service逻辑）
	@Override
	public int login(String telephone, String password) {
		// TODO Auto-generated method stub
		user u = userMapper.selectByTelephone(telephone);
		 if(u == null) {
	    		return 3;
	    	}
	    	else {
	    	  if(u.getPassword().equals(password)) {
	    		return u.getRole();//按角色返回
	    	  }
	    	  else
	    		  return 3;
	    	}
	}
	//通过手机号找人
	@Override
	public user selectuser(String telephone) {
		// TODO Auto-generated method stub
		user u = userMapper.selectByTelephone(telephone);
		return u;
	}
	 //注册
	@Override
	public int addNewUser(user u) {
		int i = userMapper.addNewUser(u);
  		return i;
	}
	//通过id查用户
	@Override
	public user selectUserById(Integer id) {
		user u = userMapper.selectByPrimaryKey(id);
		return u;
	}
	//街道查党员榜单
	@Override
	public List<user> selectdangyuanbang(Integer locatedid) {
		List<user> list = userMapper.selectdangyuanbang(locatedid);
		return list;
	}
	//调用 积分变更反写
	@Override
	public int updateByPrimaryKey(user record) {
        int i = userMapper.updateByPrimaryKey(record);
		return i;
	}
	
	
}
