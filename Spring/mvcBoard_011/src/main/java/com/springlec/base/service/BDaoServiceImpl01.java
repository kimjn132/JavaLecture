package com.springlec.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;

//@Service 꼭 써줘야 됨 중요!!!!

@Service
public class BDaoServiceImpl01 implements BDaoService01{
	
	@Autowired
	BDao dao;

	@Override
	public List<BDto> listDao() throws Exception {
		
		return dao.listDao();
	}

	@Override
	public void writeDao(HttpServletRequest request) throws Exception {
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		dao.writeDao(bName, bTitle, bContent);
	}

	
	
}
