package com.mr.nanke.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mr.nanke.BaseTest;
import com.mr.nanke.entity.HeadLine;

public class HeadLineDaoTest extends BaseTest{
	
	@Autowired
	private HeadLineDao headLineDao;
	
	@Test
	public void headLineTest() {
		HeadLine headLineCondition = new HeadLine();
		headLineCondition.setEnableStatus(1);
		List<HeadLine> headLineList = headLineDao.queryHeadLineList(headLineCondition);
		assertEquals(4, headLineList.size());
	}
	
}
