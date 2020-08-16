package com.neuedu.dangqun01.service;

import java.util.List;


import com.neuedu.dangqun01.entity.located;

public interface locatedservice {
	
	int addNewLocated(located L);//增加一个新地点
	
	located getLocatedAByAll(String province,String district,String city,String areaname);//通过地点反查id
	 
	List<located> getLocatedList(String province,String district,String city);//通过省市区查街道
	
	located getlocatedById(Integer id );//通过id查找地点
}
