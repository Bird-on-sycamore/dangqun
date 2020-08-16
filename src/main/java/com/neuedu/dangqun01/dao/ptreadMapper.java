package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.ptread;
import com.neuedu.dangqun01.entity.ptreadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ptreadMapper {
    int countByExample(ptreadExample example);

    int deleteByExample(ptreadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ptread record);//新建记录

    int insertSelective(ptread record);

    List<ptread> selectByExample(ptreadExample example);

    ptread selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ptread record, @Param("example") ptreadExample example);

    int updateByExample(@Param("record") ptread record, @Param("example") ptreadExample example);

    int updateByPrimaryKeySelective(ptread record);

    int updateByPrimaryKey(ptread record);
    
    ptread getptread(@Param("userid")Integer userid,@Param("articalid")Integer articalid);//搜索读该文章的记录
}