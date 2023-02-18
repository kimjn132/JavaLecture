	package com.bootcamp.command;
	
	import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	public interface BCCommand {
		public void execute(HttpServletRequest request, HttpServletResponse response);
		public Boolean execute1(HttpServletRequest request, HttpServletResponse response);
	}
