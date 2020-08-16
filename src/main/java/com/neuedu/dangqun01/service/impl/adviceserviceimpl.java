package com.neuedu.dangqun01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dangqun01.dao.adviceMapper;
import com.neuedu.dangqun01.entity.advice;
import com.neuedu.dangqun01.service.adviceservice;
@Service
public class adviceserviceimpl implements adviceservice {
	@Autowired
	adviceMapper  adviceMapper;
	// 查找该地点的全部建议
	@Override
	public List<advice> getAdviceList(Integer locatedid) {
		List<advice> list = adviceMapper.getAdviceList(locatedid);
		return list;
	}
	//修改建议(添加回复)
	@Override
	public int updateAdviceById(advice A) {
		int i = adviceMapper.updateByPrimaryKey(A);
		return i;
	}
	//通过id查建议（进jcad2）
	@Override
	public advice selectAdviceById(Integer id) {
		advice A = adviceMapper.selectAdviceById(id);
		return A;
	}
	// 查找该人的全部建议 (进ryad1)
	@Override
	public List<advice> getAdviceListByUser(Integer userid) {
		List<advice> list = adviceMapper.getAdviceListByUser(userid);
		return list;
	}
	//新建建议(ryad2)
	@Override
	public int addNewAdvice(advice A) {
		int i = adviceMapper.addNewAdvice(A);
		return i;
	}
	//通过id删建议，建议界面(ryad1) 
	@Override
	public int delAdviceById(Integer id) {
		int i = adviceMapper.deleteByPrimaryKey(id);
		return i;
	}

}
