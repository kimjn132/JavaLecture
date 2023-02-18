package com.springlec.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.springlec.base.model.BDto;

public interface BDaoService01 {
	
	public List<BDto> listDao() throws Exception;
	public void writeDao(HttpServletRequest request) throws Exception;
	
}
