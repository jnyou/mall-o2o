package com.mr.nanke.service;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mr.nanke.BaseTest;
import com.mr.nanke.entity.PersonInfo;
import com.mr.nanke.entity.WechatAuth;

public class WechatAuthServiceTest extends BaseTest{
	
	@Autowired
	private WechatAuthService wechatAuthService;
	
	@Test
	public void testRegister() {
		WechatAuth wechatAuth = new WechatAuth();
		wechatAuth.setCreateTime(new Date());
		wechatAuth.setOpenId("test");
		PersonInfo personInfo = new PersonInfo();
		personInfo.setCreateTime(new Date());
		personInfo.setName("test");
		personInfo.setGender("1");
		personInfo.setProfileImg("http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKCWfIBicEwS3U0legxxQd5XFpZibBXVPyz0wphvvtaXqiblzQF2GqE28c7j8FGpuYqBCg1QRJThEzuw/0");
		personInfo.setCustomerFlag(1);
		personInfo.setShopOwnerFlag(1);
		personInfo.setAdminFlag(0);
		personInfo.setCreateTime(new Date());
		personInfo.setLastEditTime(new Date());
		personInfo.setEnableStatus(1);
		wechatAuth.setPersonInfo(personInfo);
		wechatAuthService.register(wechatAuth);
	}

}
