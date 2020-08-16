package com.neuedu.dangqun01.service;

import java.util.List;

import com.neuedu.dangqun01.entity.advice;

public interface adviceservice {
	 List<advice> getAdviceList(Integer locatedid);// 查找该地点的全部建议
	 
	 int updateAdviceById(advice A);//修改建议(添加回复)
	 
	 advice selectAdviceById(Integer id);//通过id查建议（进jcad2） (进ryad3)
	 
	 List<advice>getAdviceListByUser(Integer userid);// 查找该人的全部建议 (进ryad1)
	 
	 int addNewAdvice(advice A);//新建建议(ryad2)
	 
	 int delAdviceById(Integer id);//通过id删建议，建议界面(ryad1) 
}
