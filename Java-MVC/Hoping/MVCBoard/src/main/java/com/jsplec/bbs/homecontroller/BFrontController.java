package com.jsplec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.command.BCommand;
import com.jsplec.bbs.command.BContentCommand;
import com.jsplec.bbs.command.BDeletecommand;
import com.jsplec.bbs.command.BListCommand;
import com.jsplec.bbs.command.BModifyCommand;
import com.jsplec.bbs.command.BSearchCommand;
import com.jsplec.bbs.command.BWriteCommand;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		actionDo(request,response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null;
		BCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
				
		switch(com) {
		// ?????? ?????? ??????
		case("/list.do"):
			System.out.println("doList");
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;	
		// ?????? ?????? ?????????
		case("/write_view.do"):
			System.out.println("doViewWrite");
			viewPage = "write_view.jsp";
			break;
		// ?????? ??????
		case("/write.do"):
			System.out.println("doWrite");
			command = new BWriteCommand();
			command.execute(request,response);
			viewPage = "list.do";
			break;
		// ?????? ??????
		case("/content_view.do"):
			System.out.println("doViewContent");
			command = new BContentCommand();
			command.execute(request,response);
			viewPage = "content_view.jsp";
			break;			
		case("/modify.do"):
			System.out.println("doModify");
			command = new BModifyCommand();
			command.execute(request,response);
			viewPage = "list.do";
			break;					
		case("/delete.do"):
			System.out.println("doDelete");
			command = new BDeletecommand();
			command.execute(request,response);
			viewPage = "list.do";
			break;				
		case("/search.do"):
			
			command = new BSearchCommand();
			command.execute(request,response);
			viewPage = "list.jsp";
			break;				
		
		} // switch
		
				
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request,response);
	}
	
	
	
	
	
	
	
	
} // ----

