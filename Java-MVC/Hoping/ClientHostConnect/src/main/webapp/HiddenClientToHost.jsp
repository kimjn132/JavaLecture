<%@page import="com.bootcamp.joindto.HostClientDto"%>
<%@page import="com.bootcamp.host.dao.HInfoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%

	request.setCharacterEncoding("utf-8");
	
	
	String cId = (String) session.getAttribute("CID");
	
	
	String hId = request.getParameter("hId");
	int hSeq = Integer.parseInt((String) request.getParameter("hSeq"));
	
	HInfoDao dao = new HInfoDao();
	HostClientDto dto = dao.arHost(cId);

	
	session.setAttribute("HID", hId);
	session.setAttribute("HSEQ", hSeq);
	
	 
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/check.do");
	    dispatcher.forward(request, response);
	
%>
</body>
</html>