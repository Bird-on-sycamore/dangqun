package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.located;
import com.neuedu.dangqun01.entity.locatedExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface locatedMapper {
    int countByExample(locatedExample example);

    int deleteByExample(locatedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(located record);

    int insertSelective(located record);

    List<located> selectByExample(locatedExample example);

    located selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") located record, @Param("example") locatedExample example);

    int updateByExample(@Param("record") located record, @Param("example") locatedExample example);

    int updateByPrimaryKeySelective(located record);

    int updateByPrimaryKey(located record);
    
    //注册街道时增加一条信息
    int addNewLocated(located L);
    //通过详细信息查找（注册逻辑）
    located getLocatedAByAll(@Param("province")String province,@Param("district")String district,@Param("city")String city,@Param("areaname")String areaname);
    // 人注册  通过地点查街道 ajax 
    List<located> getLocatedList(@Param("province")String province,@Param("district")String district,@Param("city")String city);
}