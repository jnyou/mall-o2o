package com.mr.nanke.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.nanke.dao.ShopCategoryDao;
import com.mr.nanke.entity.ShopCategory;
import com.mr.nanke.service.ShopCategoryService;

@Service
public class ShopCategoryServiceImpl implements ShopCategoryService{

	@Autowired
	private ShopCategoryDao shopCategoryDao;
	@Override
	public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {
		// TODO Auto-generated method stub
		return shopCategoryDao.queryShopCategory(shopCategoryCondition);
	}

	//@Override
//	public List<Area> getAreaList() throws JsonParseException,
//			JsonMappingException, IOException {
//		List<Area> areaList = null;
//		ObjectMapper mapper = new ObjectMapper();
//		return areaList;
//	}

}
