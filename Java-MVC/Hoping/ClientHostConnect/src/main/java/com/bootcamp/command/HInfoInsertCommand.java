package com.bootcamp.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bootcamp.host.dao.HInfoDao;

public class HInfoInsertCommand implements BCCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(); 
		
		String hId = (String) session.getAttribute("HID");
		
		
		String hSummary = request.getParameter("hSummary");
		
		

		
		HInfoDao dao = new HInfoDao();
		dao.insert(hId, hSummary);
		

	}
	public Boolean execute1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return null;
	}

}
