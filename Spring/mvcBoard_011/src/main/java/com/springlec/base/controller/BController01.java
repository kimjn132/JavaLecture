package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.service.BDaoService01;

//@controller 때문에 소스가 분리되어도 하나처럼 인식한다.
@Controller
public class BController01 {

	@Autowired
	BDaoService01 service;
	
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
	
	// 게시판 입력 화면
	@RequestMapping("/write_view")
	public String writeview() {
		return "write_view";
	}
	
	// 게시판 입력 실행
		@RequestMapping("/write")
		public String write(HttpServletRequest request) throws Exception{
			service.writeDao(request);
			return "redirect:list";
		}
	
	
	
} // ----
