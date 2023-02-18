package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;

@Service
public class BDaoServiceImpl implements BDaoService{
	
	@Autowired
	BDao dao;

	@Override
	public List<BDto> listDao() throws Exception {
		
		return dao.listDao();
	}

	@Override
	public void writeDao(String name, String tel, String address, String email, String relation) throws Exception {
		// TODO Auto-generated method stub
		dao.writeDao(name, tel, address, email, relation);
	}

	@Override
	public BDto viewDao(int seq) throws Exception {
		// TODO Auto-generated method stub
		return dao.viewDao(seq);
	}

	@Override
	public void deleteDao(int seq) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteDao(seq);
	}

	@Override
	public void modifyDao(String name, String tel, String address, String email, String relation, int seq) throws Exception {
		// TODO Auto-generated method stub
		dao.modifyDao(name, tel, address, email, relation, seq);
	}	
}