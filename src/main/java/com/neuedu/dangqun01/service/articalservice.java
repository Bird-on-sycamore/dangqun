package com.neuedu.dangqun01.service;

import java.util.List;



import com.neuedu.dangqun01.entity.artical;
import com.neuedu.dangqun01.entity.ptread;

public interface articalservice {
      
	int addNewArtical(artical A); //新建文章，news2
	
	 List<artical> getArticalList(Integer locatedid);//通过locatedid查文章，对应news1
	 
	  artical  getArticalById(Integer id );//通过id找文章，编辑界面(news3)
	  
	  int updateArticalById(artical A);//提交编辑界面
	  
	  int delArticalById(Integer id );//通过id删文章，查看界面(news1)
	  
	  
	  ptread getptread(Integer userid,Integer articalid);//搜索读该文章的记录（党员积分）
	  
	  int insertptread(ptread record);//新建读文章记录（党员积分）
}
