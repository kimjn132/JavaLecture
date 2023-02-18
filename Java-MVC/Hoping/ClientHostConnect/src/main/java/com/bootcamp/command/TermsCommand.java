package com.bootcamp.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TermsCommand implements BCCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	}
	public Boolean execute1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		

		String agree = request.getParameter("agree");
		String disagree = request.getParameter("disagree");
		
		Boolean result = agree.equals("agree");
		
		return null;
		
	}

}
