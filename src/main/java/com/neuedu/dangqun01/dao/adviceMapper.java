package com.neuedu.dangqun01.dao;


import com.neuedu.dangqun01.entity.advice;
import com.neuedu.dangqun01.entity.adviceExample;
import com.neuedu.dangqun01.entity.adviceWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface adviceMapper {
    int countByExample(adviceExample example);

    int deleteByExample(adviceExample example);

    int deleteByPrimaryKey(Integer id);//ryad1删除建议

    int insert(adviceWithBLOBs record);

    int insertSelective(adviceWithBLOBs record);

    List<adviceWithBLOBs> selectByExampleWithBLOBs(adviceExample example);

    List<advice> selectByExample(adviceExample example);

    adviceWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") adviceWithBLOBs record, @Param("example") adviceExample example);

    int updateByExampleWithBLOBs(@Param("record") adviceWithBLOBs record, @Param("example") adviceExample example);

    int updateByExample(@Param("record") advice record, @Param("example") adviceExample example);

    int updateByPrimaryKeySelective(adviceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(adviceWithBLOBs record);

    int updateByPrimaryKey(advice record);//修改建议（给予回复jcad2）
    
    List<advice> getAdviceList(Integer locatedid);// 查找该地点的全部建议
    
    advice selectAdviceById(Integer id);//通过id查建议（进jcad2） (进ryad3)
    
    List<advice>getAdviceListByUser(Integer userid);// 查找该人的全部建议 (进ryad1)
    
    int addNewAdvice(advice A);//新建建议(ryad2)
    
}