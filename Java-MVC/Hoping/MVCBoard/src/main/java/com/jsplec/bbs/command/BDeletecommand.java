package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.BDao;

public class BDeletecommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bId = Integer.parseInt(request.getParameter("bId"));
		BDao dao = new BDao();
		dao.delete(bId);
		
		
	}

}
