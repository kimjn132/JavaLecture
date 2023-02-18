package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.service.CalcService;

@Controller
public class AController {

	//new 사용 안하고쓰는 생성자가 autowired 이다.
	@Autowired
	CalcService service;
	
	// 계산 입력 화면
	@RequestMapping("/")
	public String input() {
		return "input";
	}
	
	// 계산 실행 
	@RequestMapping("/addCalc")
	public String calc(HttpServletRequest request, Model model) throws Exception {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int addResult = service.addAction(num1, num2);
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("addition", addResult);
		
		return "calcResult";
		
		

	}
	// 계산 실행 
	@RequestMapping("/multiCalc")
	public String calc2(HttpServletRequest request, Model model) throws Exception {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int multiResult = service.multiAction(num1, num2);
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("multiplication", multiResult);
		
		return "calcResult";
		
		
		
	}
}
