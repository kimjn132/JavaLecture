package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.BDao;

public class BDeletecommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int seq = Integer.parseInt(request.getParameter("seq"));
		BDao dao = new BDao();
		dao.delete(seq);
		
		
	}

}
