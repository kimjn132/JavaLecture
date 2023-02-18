package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.service.ClientDaoService;

@Controller
public class BCFrontController {

	@Autowired
	ClientDaoService service;
	
	
	// 게시판 입력 화면
		@RequestMapping("/cJoinView")
		public String joinView() {
			return "ClientSignupView";
		}
		
	//client join
	@RequestMapping("/Clientwrite")
	public String cJoin(HttpServletRequest request) throws Exception{
		service.cJoinDao(request);
		return "redirect:ClientLoginView";
	}
	
}
