package com.jsplec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.dao.FileDao;


public class FileUpCommand implements FCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String fileName = (String) request.getAttribute("FILENAME");
		
		FileDao dao = new FileDao();
		dao.fileUpload(fileName);

	}

}
