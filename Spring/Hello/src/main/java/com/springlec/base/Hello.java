package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	@RequestMapping("/")
	public String hello() {
		System.out.println("Hello world!");
		return "index";
		
	}
}
