package com.springlec.base.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ClientDao;

@Service
public class ClientDaoServiceImpl implements ClientDaoService {

	@Autowired
	ClientDao dao;
	
	@Override
	public void cJoinDao(HttpServletRequest request) throws Exception {
		String cId = request.getParameter("cId");
		String cPw = request.getParameter("cPw");
		String cName = request.getParameter("cName");
		String cPhone = request.getParameter("cPhone");
		String cEmail = request.getParameter("cEmail");
		String cDate = request.getParameter("cDate");
		int zonecode = Integer.parseInt(request.getParameter("zonecode"));
		String address = request.getParameter("address");
		String buildingName = request.getParameter("buildingName");
		String detailAddress = request.getParameter("detailAddress");
		
		dao.cJoinDao(cId, cPw, cName, cPhone, cEmail, cDate, zonecode, address, buildingName, detailAddress);
	}

}
