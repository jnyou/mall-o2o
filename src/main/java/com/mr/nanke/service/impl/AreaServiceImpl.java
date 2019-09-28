package com.mr.nanke.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.nanke.dao.AreaDao;
import com.mr.nanke.entity.Area;
import com.mr.nanke.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDao areaDao;
	@Override
	public List<Area> getAreaList() {
		// TODO Auto-generated method stub
		return areaDao.queryArea();
	}
	//@Autowired
	//private AreaDao areaDao;

	//@Override
//	public List<Area> getAreaList() throws JsonParseException,
//			JsonMappingException, IOException {
//		List<Area> areaList = null;
//		ObjectMapper mapper = new ObjectMapper();
//		return areaList;
//	}

}
