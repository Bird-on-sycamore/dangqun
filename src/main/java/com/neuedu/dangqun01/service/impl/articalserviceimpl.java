package com.neuedu.dangqun01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dangqun01.dao.articalMapper;
import com.neuedu.dangqun01.dao.ptreadMapper;
import com.neuedu.dangqun01.entity.artical;
import com.neuedu.dangqun01.entity.ptread;
import com.neuedu.dangqun01.service.articalservice;
@Service
public class articalserviceimpl implements articalservice {
	@Autowired
	articalMapper articalMapper;
	@Autowired
	ptreadMapper ptreadMapper;
	//新建文章
	@Override
	public int addNewArtical(artical A) {
		int i = articalMapper.addNewArtical(A);
		return i;
	}
    //通过locatedid查文章，对应news1
	@Override
	public List<artical> getArticalList(Integer locatedid) {
		List<artical> articalList = articalMapper.getArticalList(locatedid);
		return articalList;
	}
	//通过id找文章，编辑界面(news3)
	@Override
	public artical getArticalById(Integer id) {
		artical A = articalMapper.selectByPrimaryKey(id);
		return A;
	}
	//提交编辑界面
	@Override
	public int updateArticalById(artical A) {
		int i = articalMapper.updateArticalById(A);
		return i;
	}
	//通过id删文章，查看界面(news1)
	@Override
	public int delArticalById(Integer id) {
		int i = articalMapper.deleteByPrimaryKey(id);
		return i;
	}
	//通过用户和文章查阅读记录（党员阅读积分）
	@Override
	public ptread getptread(Integer userid, Integer articalid) {
		ptread P = ptreadMapper.getptread(userid, articalid);
		return P;
	}
	//新建读文章记录（党员积分）
	@Override
	public int insertptread(ptread record) {
		int i = ptreadMapper.insert(record);
		return i;
	}

}
