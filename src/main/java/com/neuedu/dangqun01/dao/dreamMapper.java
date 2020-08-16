package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.dream;
import com.neuedu.dangqun01.entity.dreamExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface dreamMapper {
    int countByExample(dreamExample example);

    int deleteByExample(dreamExample example);

    int deleteByPrimaryKey(Integer id);//rydr1 删除愿望

    int insert(dream record);//rydr2

    int insertSelective(dream record);

    List<dream> selectByExampleWithBLOBs(dreamExample example);

    List<dream> selectByExample(dreamExample example);

    dream selectByPrimaryKey(Integer id);//通过id找愿望(显示dream2)

    int updateByExampleSelective(@Param("record") dream record, @Param("example") dreamExample example);

    int updateByExampleWithBLOBs(@Param("record") dream record, @Param("example") dreamExample example);

    int updateByExample(@Param("record") dream record, @Param("example") dreamExample example);

    int updateByPrimaryKeySelective(dream record);

    int updateByPrimaryKeyWithBLOBs(dream record);

    int updateByPrimaryKey(dream record);//进行审核，更新愿望(dream2)
    
    List<dream>  getDreamList(Integer located);//通过地点id找该地区的愿望清单(dream1)
    
    List<dream>  getDreamListByuseid(Integer useid);//通过人员id找愿望清单(显示rydr1)   
    
    
}