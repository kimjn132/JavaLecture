package com.jsplec.bss.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bss.dao.ZDao;
import com.jsplec.bss.dto.ZDto;

public class ZProductDetailCommand implements ZCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		
		String pId = request.getParameter("pId");
		ZDao dao = new ZDao();
		ZDto dto = dao.detail(pId);
		
		request.setAttribute("detail", dto);
		session.setAttribute("PID", pId);
		
		
		
		String cId = request.getParameter("cId");
		//ZDao dao = new ZDao();
		ZDto dto2 = dao.customer();
		
		request.setAttribute("customer", dto2);
		
		session.setAttribute("CID", cId);
	}

}
