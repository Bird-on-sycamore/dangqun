package com.neuedu.dangqun01.service;

import java.util.List;


import com.neuedu.dangqun01.entity.activity;
import com.neuedu.dangqun01.entity.partyattend;


public interface activityservice {
      
	int addNewActivity(activity A); //新建活动，activity2
	
	 List<activity> getActivityList(Integer locatedid);//通过locatedid查活动，对应activity1
	 
	 activity getActivityById(Integer id);//通过id找活动，编辑界面(activity3)
	 
	 int updateActivityById(activity A);//提交编辑界面
	 
	 int delActivityById(Integer id );//通过id删文章，查看界面(activity1) 
	 
	 List<partyattend> getPtAtdList(Integer activityid);//通过活动名查ptatd，再找user(activity4)
	 
	 partyattend getPtAtdById(Integer id);//通过id找PtAtd(activity4)
	 
	 int updatePtAtdById(partyattend P);//根据id改参与状态(activity4)
	 
	 int delPtAtdById(Integer id );//通过id删用用户参与(activity4) 撤销报名(ryac1)
	 
	 int addNewPtAtd(partyattend P);//新增参与(ryac1)
	 
	 partyattend  getPtAtdBy2(Integer activityid,Integer userid);//通过活动id以及人员id查ptatd
}
