package com.mr.nanke.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mr.nanke.BaseTest;
import com.mr.nanke.entity.ShopCategory;

public class ShopCategoryDaoTest extends BaseTest{
	@Autowired
	private ShopCategoryDao shopCategroyDao;
	@Test
	public void testBQueryshopCategroyDao() throws Exception {
//		List<ShopCategory> shopCategory = shopCategroyDao.queryShopCategory(new ShopCategory());
//		assertEquals(18, shopCategory.size()); // 验证数据库的row数
		
		
		List<ShopCategory> shopCategory1 = shopCategroyDao.queryShopCategory(null);
		System.out.println(shopCategory1.size());
		
	}
	
	
}
