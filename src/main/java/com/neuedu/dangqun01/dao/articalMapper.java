package com.neuedu.dangqun01.dao;

import com.neuedu.dangqun01.entity.artical;
import com.neuedu.dangqun01.entity.articalExample;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface articalMapper {
    int countByExample(articalExample example);

    int deleteByExample(articalExample example);

    int deleteByPrimaryKey(Integer id);//被引用,文章删除

    int insert(artical record);

    int insertSelective(artical record);

    List<artical> selectByExampleWithBLOBs(articalExample example);

    List<artical> selectByExample(articalExample example);

    artical selectByPrimaryKey(Integer id);//被引用，根据id查找文章，进入news3

    int updateByExampleSelective(@Param("record") artical record, @Param("example") articalExample example);

    int updateByExampleWithBLOBs(@Param("record") artical record, @Param("example") articalExample example);

    int updateByExample(@Param("record") artical record, @Param("example") articalExample example);

    int updateByPrimaryKeySelective(artical record);

    int updateByPrimaryKeyWithBLOBs(artical record);

    int updateByPrimaryKey(artical record);
    
    //新建文章
    int addNewArtical(artical A);
    // 查找该地点的全部新闻
    List<artical> getArticalList(Integer locatedid);
    //编辑文章
    int updateArticalById(artical A);
    
}