package com.mr.nanke.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.nanke.dao.HeadLineDao;
import com.mr.nanke.entity.HeadLine;
import com.mr.nanke.service.HeadLineService;

@Service
public class HeadLineServiceImpl implements HeadLineService{
	
	@Autowired
	private HeadLineDao headLineDao;

	@Override
	public List<HeadLine> getHeadLine(HeadLine headLineCondition) throws IOException {
		// TODO Auto-generated method stub
		return headLineDao.queryHeadLineList(headLineCondition);
	}
	
	
	
}
