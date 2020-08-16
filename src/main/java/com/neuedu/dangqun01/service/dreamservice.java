package com.neuedu.dangqun01.service;

import java.util.List;

import com.neuedu.dangqun01.entity.dream;
import com.neuedu.dangqun01.entity.ptdreamsolve;


public interface dreamservice {
	List<dream> getDreamList(Integer located);// 查找该地点的全部愿望
	 
	 int updateDreamById(dream D);//修改愿望(审核)
	 
	 dream selectDreamById(Integer id);//通过id查愿望（进jcdr2）
	 
	 List<dream>  getDreamListByuseid(Integer useid);//通过人员id找愿望清单(显示rydr1)   
	 
	 ptdreamsolve getPtdsBydreamid(Integer dreamid);//通过愿望查帮助(rydr1状态判断)
     
	 int insert(dream record);//rydr2
	 
	 int deleteById(Integer id);//rydr1 删除愿望
	 
	 int deleteptdsById(Integer id);//rydr4 未完成删除该帮助
	 
	 int insertptds(ptdreamsolve record);//ryda7 我来帮
}
