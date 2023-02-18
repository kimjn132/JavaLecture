package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.BDto;

public interface BDao {
	
	public List<BDto> listDao() throws Exception; 
	public void writeDao(String bName, String bTitle, String bContent) throws Exception;
	public BDto viewDao(int bId) throws Exception;
	public void deleteDao(int bId) throws Exception;
	public void modifyDao(String bName, String bTitle, String bContent, int bId) throws Exception;
	

}
