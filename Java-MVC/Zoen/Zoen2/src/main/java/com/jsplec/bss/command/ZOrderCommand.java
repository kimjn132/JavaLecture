package com.jsplec.bss.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bss.dao.ZDao;

public class ZOrderCommand implements ZCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String cId = session.getAttribute("CID");
		int pId = Integer.parseInt(session.getAttribute("PID"));
		
		
		ZDao dao = new ZDao();
		//dao.order(cId, pId);
	}

}
