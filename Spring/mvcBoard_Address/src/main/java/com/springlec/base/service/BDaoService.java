package com.springlec.base.service;

import java.util.List;

import com.springlec.base.model.BDto;

public interface BDaoService {
	
	public List<BDto> listDao() throws Exception;
	public void writeDao(String name, String tel, String address, String email, String relation) throws Exception;
	public BDto viewDao(int seq) throws Exception;
	public void deleteDao(int seq) throws Exception;
	public void modifyDao(String name, String tel, String address, String email, String relation, int seq) throws Exception;

}