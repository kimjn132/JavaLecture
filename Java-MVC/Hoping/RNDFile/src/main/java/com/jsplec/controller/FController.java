package com.jsplec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.command.FCommand;
import com.jsplec.command.FileUpCommand;
import com.jsplec.command.FileViewCommand;

@WebServlet("*.do")

public class FController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FController() {
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
		// 인터페이스니까
		FCommand command = null;

		//a.do만 필요함. 
		String uri = request.getRequestURI();
		// MVCBoard/a.do
		String conPath = request.getContextPath();
		// MVCBoard
		String com = uri.substring(conPath.length());
		// a.do만 나옴
		// 사용자가 뭐를 썼는지 알 수 있게 되었따.

		// 리스트 띄우기
		// com을 case별로 비교하기 
		switch (com) {
			case ("/list.do"): 
				viewPage = "fileSeletDB.jsp";
				break;
			
			case ("/fileUp.do"): 
				command = new FileUpCommand();
				command.excute(request, response);
				break;
				
			case ("/fileView.do"): 
				command = new FileViewCommand();
				command.excute(request, response);
				viewPage = "fileShow.jsp";
				break;
				
			
			
		}//switch

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}//END
