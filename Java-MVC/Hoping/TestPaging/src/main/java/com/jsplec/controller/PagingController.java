package com.jsplec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.command.PagingCommand;
import com.jsplec.command.PagingDiv2Command;
import com.jsplec.command.PagingDivCommand;

@WebServlet("*.do")

public class PagingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PagingController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8"); // 한글 처리

		String viewPage = null;
		PagingCommand command = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		switch (com) {
			
			case ("/list.do"): 
				command = new PagingDivCommand();
				command.excute(request, response);
				viewPage = "list2.do?page=1";
				break;
				
			case ("/list2.do"): 
				command = new PagingDiv2Command();
				command.excute(request, response);
				viewPage = "paging.jsp";
				break;
				
		}//switch

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}//END
