package com.mr.nanke.utils;

public class PathUtil {
	/***
	 * 由于系统的分隔符不同 需要指定替换 
	 * 1. win：( \ ) 
	 * 2. linux/max：( / )
	 */
	// 系统自动获取文件的分隔符
	private static String seperator = System.getProperty("file.separator");
	/***
	 * 返回项目图片的根路径
	 * @return
	 */
	public static String getImgBasePath() {
		String os = System.getProperty("os.name"); // 系统自动识别出系统的名字 是Linux还是window或者其他。。。
		String basePath = "";
		if(os.toLowerCase().startsWith("win")) {
			basePath = "D:/projectdev/upload";
		}else {
			basePath = "/home/o2o/images";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
	
	/***
	 * 获取商品图片的地址保存在自己的店铺下
	 * @param shopId
	 * @return
	 */ 
	public static String getShopImagePath(long shopId) {
		String imagaPath = "/upload/images/item/shop/" + shopId + "/";
		return imagaPath.replace("/", seperator);
		
	}
}
