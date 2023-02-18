package com.springlec.base.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;

@Service
public class BDaoServiceImpl02 implements BDaoService02{
	
	@Autowired
	BDao dao;


	@Override
	public BDto viewDao(int bId) throws Exception {
		// TODO Auto-generated method stub
		return dao.viewDao(bId);
	}

	@Override
	public void deleteDao(int bId) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteDao(bId);
	}

	@Override
	public void modifyDao(String bName, String bTitle, String bContent, int bId) throws Exception {
		// TODO Auto-generated method stub
		dao.modifyDao(bName, bTitle, bContent, bId);
	}





	
}
