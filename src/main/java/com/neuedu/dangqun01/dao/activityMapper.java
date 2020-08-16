package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.activity;
import com.neuedu.dangqun01.entity.activityExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface activityMapper {
    int countByExample(activityExample example);

    int deleteByExample(activityExample example);

    int deleteByPrimaryKey(Integer id);//被引用,活动删除

    int insert(activity record);

    int insertSelective(activity record);

    List<activity> selectByExampleWithBLOBs(activityExample example);

    List<activity> selectByExample(activityExample example);

    activity selectByPrimaryKey(Integer id);//被引用，根据id查找文章，进入activity3

    int updateByExampleSelective(@Param("record") activity record, @Param("example") activityExample example);

    int updateByExampleWithBLOBs(@Param("record") activity record, @Param("example") activityExample example);

    int updateByExample(@Param("record") activity record, @Param("example") activityExample example);

    int updateByPrimaryKeySelective(activity record);

    int updateByPrimaryKeyWithBLOBs(activity record);

    int updateByPrimaryKey(activity record);//编辑活动(相较于artical进行改进，直接用默认的)
    
    //新建活动
    int addNewActivity(activity A);
    // 查找该地点的全部活动
    List<activity> getActivityList(Integer locatedid);

    
}