package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.BCustomerDao;

public class BDeleteCustomerCommand implements ZCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String cId = request.getParameter("cId");
		BCustomerDao dao = new BCustomerDao();
		dao.deleteCustomer(cId);
		
		
	}

}
