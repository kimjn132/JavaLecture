<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.io.*"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%

	request.setCharacterEncoding("utf-8");
	String realFolder = "";

	String saveFolder = "images"; // out폴더에 fileSave 폴더 생성
	String encType = "utf-8";
	int maxSize = 5*1024*1024; // 최대 업로드 5mb

	ServletContext context = request.getServletContext();
	realFolder = application.getRealPath(saveFolder);
	
	/* String filePath = application.getRealPath(fileName); */
	
	out.println("the realpath is: " + realFolder + "<br>");

	try {
	    MultipartRequest multi = null;

	    multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());

	    Enumeration params = multi.getParameterNames();

	    while(params.hasMoreElements()) {
	        String name = (String) params.nextElement();
	        String value = multi.getParameter(name);
	        out.println(name + " = " + value + "<br>");
	    }

	    out.println("-------------------<br>");

	    Enumeration files = multi.getFileNames();

	    while(files.hasMoreElements()) {
	        String name = (String)files.nextElement();
	        String filename = multi.getFilesystemName(name);
	        String original = multi.getOriginalFileName(name);
	        String type = multi.getContentType(name);
	        File file = multi.getFile(name);


	        out.println("파라미터 이름" + name + "<br>");
	        out.println("실제 파일 이름" + original + "<br>");
	        out.println("저장된 파일 이름" + filename + "<br>");
	        out.println("파일 타입 이름" + type + "<br>");

		    if(file!= null) {
		        out.println("크기: " + file.length() + "<br>");
		    }
		    
		    request.setAttribute("FILENAME", filename);
		    RequestDispatcher dispatcher = request.getRequestDispatcher("fileUp.do");
		    dispatcher.forward(request, response);
		    
	    }
	    

	}catch (IOException ioe) {
		System.out.println(ioe);
	} catch (Exception ex) {
		System.out.println(ex);
	}
%>