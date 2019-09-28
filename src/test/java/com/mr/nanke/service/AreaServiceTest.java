package com.mr.nanke.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mr.nanke.BaseTest;
import com.mr.nanke.entity.Area;

public class AreaServiceTest extends BaseTest{
	@Autowired
	private AreaService areaService;
	@Test
	public void areaServiceTest() {
		List<Area> areas = areaService.getAreaList();
		assertEquals("东苑", areas.get(0).getAreaName()); //验证数据库第一行数据的名字是否为东苑
	}
}
