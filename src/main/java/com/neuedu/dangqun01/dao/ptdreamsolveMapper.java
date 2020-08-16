package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.ptdreamsolve;
import com.neuedu.dangqun01.entity.ptdreamsolveExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ptdreamsolveMapper {
    int countByExample(ptdreamsolveExample example);

    int deleteByExample(ptdreamsolveExample example);

    int deleteByPrimaryKey(Integer id);//rydr4 未完成删除该帮助

    int insert(ptdreamsolve record);//ryda7 我来帮

    int insertSelective(ptdreamsolve record);

    List<ptdreamsolve> selectByExample(ptdreamsolveExample example);

    ptdreamsolve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ptdreamsolve record, @Param("example") ptdreamsolveExample example);

    int updateByExample(@Param("record") ptdreamsolve record, @Param("example") ptdreamsolveExample example);

    int updateByPrimaryKeySelective(ptdreamsolve record);

    int updateByPrimaryKey(ptdreamsolve record);
    
    ptdreamsolve getPtdsBydreamid(Integer dreamid);//通过愿望查帮助(rydr1状态判断)
}