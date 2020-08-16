package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.user;
import com.neuedu.dangqun01.entity.userExample;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface userMapper {
    int countByExample(userExample example);

    int deleteByExample(userExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userExample example);

    user selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") user record, @Param("example") userExample example);

    int updateByExample(@Param("record") user record, @Param("example") userExample example);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);//调用 积分变更反写
    
    //demo测试，无用，不要误调
    int addUser(user u);
   //登录
    user selectByTelephone(String telephone);
    //注册
    int addNewUser(user u);
    //街道获取该地区党员榜单
    List<user>selectdangyuanbang(Integer locatedid);
    
}