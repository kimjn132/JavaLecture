package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form_02 {
	
	//get(? 필요)이나 post 방식 둘 다 아님/ {studentId}>데이터
	@RequestMapping("/student/{studentId}")
	public String getStudent(@PathVariable String studentId, Model model) {
		model.addAttribute("studentId", studentId);
		return "student/studentView";	
	}
	
	
	@RequestMapping("/student/studentGet")
	public String getStudent1() {
		
		return "student/studentGet";	
	}
	
	
	@RequestMapping("/student/showStudent")
	public String showStudent(Model model, @RequestParam("studentId") String studentId) {
		System.out.println("studentResult");
		model.addAttribute("studentId", studentId);
		return "student/studentResult";	
	}
}
