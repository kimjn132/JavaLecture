package com.jsplec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.dao.FileDao;
import com.jsplec.dto.FileDto;

public class FileViewCommand implements FCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		FileDao dao = new FileDao();
		FileDto dto = dao.fileView();
		
		request.setAttribute("detail_view", dto);

	}

}
