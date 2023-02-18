package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMapping_02 {
	
	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest request, Model model) throws Exception{
		String id = request.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOK";
		}
		return "redirect:studentNG";
	}
	
	@RequestMapping("/studentOK")
	public String studentOK() throws Exception {
		return "student/studentOK";
	}
	
	@RequestMapping("/studentNG")
	public String studentNG() throws Exception {
		return "student/studentNG";
	}
	
	
	
}
