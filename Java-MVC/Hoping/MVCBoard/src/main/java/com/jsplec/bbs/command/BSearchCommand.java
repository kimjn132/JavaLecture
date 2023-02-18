package com.jsplec.bbs.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.BDao;
import com.jsplec.bbs.dto.BDto;

public class BSearchCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.searchDate(start, end);
		request.setAttribute("list", dtos);
		
	}

}
