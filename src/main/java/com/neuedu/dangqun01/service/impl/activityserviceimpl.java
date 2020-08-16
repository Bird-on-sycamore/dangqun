package com.neuedu.dangqun01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dangqun01.dao.activityMapper;
import com.neuedu.dangqun01.dao.partyattendMapper;
import com.neuedu.dangqun01.entity.activity;
import com.neuedu.dangqun01.entity.partyattend;
import com.neuedu.dangqun01.service.activityservice;
@Service
public class activityserviceimpl implements activityservice {
	@Autowired
	activityMapper activityMapper;
	@Autowired
	partyattendMapper partyattendMapper;
	//新建活动，activity2
	@Override
	public int addNewActivity(activity A) {
		int i = activityMapper.addNewActivity(A);
		return i;
	}
	//通过locatedid查活动，对应activity1
	@Override
	public List<activity> getActivityList(Integer locatedid) {
	    List<activity> activityList = activityMapper.getActivityList(locatedid);
		return activityList;
	}
	//通过id找活动，编辑界面(activity3)
	@Override
	public activity getActivityById(Integer id) {
		activity A = activityMapper.selectByPrimaryKey(id);
		return A;
	}
	//提交编辑界面
	@Override
	public int updateActivityById(activity A) {
		int i = activityMapper.updateByPrimaryKey(A);
		return i;
	}
	//通过id删文章，查看界面(activity1)
	@Override
	public int delActivityById(Integer id) {
		int i = activityMapper.deleteByPrimaryKey(id);
		return i;
	}
	//通过活动名查ptatd，再找user(activity4)
	@Override
	public List<partyattend> getPtAtdList(Integer activityid) {
		List<partyattend> ptAtdList = partyattendMapper.getPtAtdList(activityid);
		return ptAtdList;
	}
	//通过id找PtAtd(activity4)
	@Override
	public partyattend getPtAtdById(Integer id) {
		partyattend P = partyattendMapper.selectByPrimaryKey(id);
		return P;
	}
	//根据id改参与状态(activity4)
	@Override
	public int updatePtAtdById(partyattend P) {
		int i = partyattendMapper.updateByPrimaryKey(P);
		return i;
	}
	//通过id删用用户参与(activity4)
	@Override
	public int delPtAtdById(Integer id) {
          int i = partyattendMapper.deleteByPrimaryKey(id);
		return i;
	}
	//新增参与(ryac1)
	@Override
	public int addNewPtAtd(partyattend P) {
		   int i = partyattendMapper.insert(P);
		return i;
	}
	//通过活动id以及人员id查ptatd
	@Override
	public partyattend getPtAtdBy2(Integer activityid, Integer userid) {
		partyattend P = partyattendMapper.getPtAtdBy2(activityid, userid);
		return P;
	}
	

}
