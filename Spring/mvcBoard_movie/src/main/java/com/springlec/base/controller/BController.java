package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.service.BDaoService;

@Controller
public class BController {

	@Autowired
	BDaoService service;
	
	// 게시판 검색
	@RequestMapping("/list")
	public String list(Model model) throws Exception{
		//service의 listDao로 받은 데이터 담기 to BDto(arraylist) 형식으로>>담은 정보를 listDao 변수명으로 이름 붙이기
		List<BDto> listDao = service.listDao();
		//listDao 변수에 담은 배열 정보 "list"에 넣어줌
		model.addAttribute("list", listDao);
		//"list"로 리턴해줌
		return "list";
	}
	
	

} 