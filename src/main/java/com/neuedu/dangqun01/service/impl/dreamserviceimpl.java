package com.neuedu.dangqun01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dangqun01.dao.dreamMapper;
import com.neuedu.dangqun01.dao.ptdreamsolveMapper;
import com.neuedu.dangqun01.entity.dream;
import com.neuedu.dangqun01.entity.ptdreamsolve;
import com.neuedu.dangqun01.service.dreamservice;
@Service
public class dreamserviceimpl implements dreamservice {
	@Autowired
	dreamMapper dreamMapper; 
	@Autowired
	ptdreamsolveMapper ptdreamsolveMapper;
	
	
	// 查找该地点的全部愿望
	@Override
	public List<dream> getDreamList(Integer located) {
		List<dream> dreamList = dreamMapper.getDreamList(located);
		return dreamList;
	}
	//修改愿望(审核)
	@Override
	public int updateDreamById(dream D) {
		int i = dreamMapper.updateByPrimaryKey(D);
		return i;
	}
	//通过id查愿望（进jcdr2）
	@Override
	public dream selectDreamById(Integer id) {
		dream D = dreamMapper.selectByPrimaryKey(id);
		return D;
	}
	//通过人员id找愿望清单(显示rydr1)   
	@Override
	public List<dream> getDreamListByuseid(Integer useid) {
		List<dream> list = dreamMapper.getDreamListByuseid(useid);
		return list;
	}
	//通过愿望查帮助(rydr1状态判断)
	@Override
	public ptdreamsolve getPtdsBydreamid(Integer dreamid) {
		ptdreamsolve P = ptdreamsolveMapper.getPtdsBydreamid(dreamid);
		return P;
	}
	//rtdr2
	@Override
	public int insert(dream record) {
		int i = dreamMapper.insert(record);
		return i;
	}
	//rydr1 删除愿望
	@Override
	public int deleteById(Integer id) {
		int i = dreamMapper.deleteByPrimaryKey(id);
		return i;
	}
	//rydr4 未完成删除该帮助
	@Override
	public int deleteptdsById(Integer id) {
		int i = ptdreamsolveMapper.deleteByPrimaryKey(id);
		return i;
	}
	//ryda7 我来帮
	@Override
	public int insertptds(ptdreamsolve record) {
		   int i = ptdreamsolveMapper.insert(record);
		return i;
	}

}
