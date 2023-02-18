package com.bootcamp.host.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCCommand {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
	public Boolean execute1(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
