package com.jsplec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface FCommand {
	
	public void excute(HttpServletRequest request, HttpServletResponse response);

}
