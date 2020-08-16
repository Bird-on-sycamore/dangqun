package com.neuedu.dangqun01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dangqun01.dao.locatedMapper;
import com.neuedu.dangqun01.entity.located;
import com.neuedu.dangqun01.service.locatedservice;

@Service
public class locatedserviceimpl implements locatedservice {
     
	@Autowired
	locatedMapper locatedMapper;
	//增加一个新地点
	@Override
	public int addNewLocated(located L) {
		int i = locatedMapper.addNewLocated(L);
  		return i;
	}
	//通过地点反查id
	@Override
	public located getLocatedAByAll(String province, String district, String city, String areaname) {
		located L = locatedMapper.getLocatedAByAll(province, district, city, areaname);
		return L;
	}
	//通过省市区查街道
	@Override
	public List<located> getLocatedList(String province, String district, String city) {
		List<located> list =locatedMapper.getLocatedList(province, district, city);
		return list;
	}
	//通过id查找地点
	@Override
	public located getlocatedById(Integer id) {
		located L = locatedMapper.selectByPrimaryKey(id);
		return L;
	}

}
