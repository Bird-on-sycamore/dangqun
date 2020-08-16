package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.partyattend;
import com.neuedu.dangqun01.entity.partyattendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface partyattendMapper {
    int countByExample(partyattendExample example);

    int deleteByExample(partyattendExample example);

    int deleteByPrimaryKey(Integer id);//jcac4，根据id删ptatd

    int insert(partyattend record);//ryac1,2,报名参与

    int insertSelective(partyattend record);

    List<partyattend> selectByExample(partyattendExample example);

    partyattend selectByPrimaryKey(Integer id);//jcac4，根据id取ptatd

    int updateByExampleSelective(@Param("record") partyattend record, @Param("example") partyattendExample example);

    int updateByExample(@Param("record") partyattend record, @Param("example") partyattendExample example);

    int updateByPrimaryKeySelective(partyattend record);

    int updateByPrimaryKey(partyattend record);//jcac4，根据id改ptatd
    //jcac4 按照活动id找ptatd，根据这个再找user
    List<partyattend> getPtAtdList(Integer activityid);
    
    partyattend  getPtAtdBy2(@Param("activityid")Integer activityid,@Param("userid")Integer userid);//通过活动id以及人员id查ptatd
    
    
}