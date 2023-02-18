package com.springlec.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form_01 {

	@RequestMapping("/board/confirmId")
	public String confirmId(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/confirmId";
		
	}
	
	@RequestMapping("/board/checkId")
	public String checkId(Model model, @RequestParam("id") String id, @RequestParam("pw") int pw) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/confirmId";
		
	}
	
	@RequestMapping("/board/join")
	public String join(Model model, @RequestParam("name") String name, @RequestParam("id") String id, @RequestParam("pw") int pw, @RequestParam("email") String email) {
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("email", email);
		
		return "board/join";
		
	}
	
	@RequestMapping("/board/join1")
	public String join1(Member member) {
		
		return "board/join1";
	}
	
	
	
	
	
	
	
}
