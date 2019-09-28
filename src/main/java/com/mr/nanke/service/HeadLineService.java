package com.mr.nanke.service;

import java.io.IOException;
import java.util.List;


import com.mr.nanke.entity.HeadLine;


public interface HeadLineService {	
	/***
	 * 
	 * @param headLineCondition
	 * @return
	 * @throws IOException
	 */
	List<HeadLine> getHeadLine(HeadLine headLineCondition) throws IOException;
}
