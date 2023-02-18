package com.jsplec.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.dao.PagingDao;
import com.jsplec.dto.PagingDto;

public class PagingDiv2Command implements PagingCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		
		PagingDao dao = new PagingDao();
		int page = Integer.parseInt(request.getParameter("page"));
			
		//한 페이지당 row의 개수
		int pageRow = 10;
		
		//페이지 시작점
		int startRow = 10 * (page -1);
		
		//전체 row 개수
		int countRow = dao.countRow();
		
		//총 페이지 개수
		int pageCount = (countRow / 10) +1;
		request.setAttribute("pageCount", pageCount);
		
		ArrayList<PagingDto> dtos = dao.list(startRow, pageRow);
		
		request.setAttribute("list", dtos);
		
	}

}
