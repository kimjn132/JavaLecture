package com.jsplec.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.dao.PagingDao;

public class PagingDivCommand implements PagingCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {

		PagingDao dao = new PagingDao();

		//전체 row 개수
		int countRow = dao.countRow();
		
		//총 페이지 개수
		int pageCount = (countRow / 10) +1;
		request.setAttribute("pageCount", pageCount);
		
	}

}
