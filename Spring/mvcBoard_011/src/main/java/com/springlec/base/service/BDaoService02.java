package com.springlec.base.service;



import com.springlec.base.model.BDto;

public interface BDaoService02 {
	
	public BDto viewDao(int bId) throws Exception;
	public void deleteDao(int bId) throws Exception;
	public void modifyDao(String bName, String bTitle, String bContent, int bId) throws Exception;

}
