package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.BDto;

public interface BDao {
	
	public List<BDto> listDao() throws Exception; 
	public void writeDao(String name, String tel, String address, String email, String relation) throws Exception;
	public BDto viewDao(int seq) throws Exception;
	public void deleteDao(int seq) throws Exception;
	public void modifyDao(String name, String tel, String address, String email, String relation, int seq) throws Exception;
	public List<BDto> listSearch(String query, String content) throws Exception; 
}