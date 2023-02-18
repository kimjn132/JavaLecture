package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;

import com.springlec.base.service.BDaoService02;

@Controller
public class BController02 {

	@Autowired
	BDaoService02 service;

	// 게시판 개별 검색
	@RequestMapping("/content_view")
	public String contentView(HttpServletRequest request, Model model) throws Exception {
		BDto contentDto = service.viewDao(Integer.parseInt(request.getParameter("bId")));
		model.addAttribute("content_view", contentDto);
		return "content_view";
	}

	// 게시판 개별 삭제
	@RequestMapping("/delete")
	public String contentDelete(HttpServletRequest request, Model model) throws Exception {
		service.deleteDao(Integer.parseInt(request.getParameter("bId")));
		return "redirect:list";
	}

	// 게시판 개별 수정
	@RequestMapping("/modify")
	public String contentUpdate(HttpServletRequest request, Model model) throws Exception {
		service.modifyDao(request.getParameter("bName"), request.getParameter("bTitle"),
				request.getParameter("bContent"), Integer.parseInt(request.getParameter("bId")));
		return "redirect:list";
	}

	// --------

} // ----
