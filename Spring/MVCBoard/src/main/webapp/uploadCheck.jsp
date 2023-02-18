<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.io.*"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 실제로 서버에 저장되는 path
    String path = request.getRealPath("uploadedFiles");
    int size = 1024 * 1024 * 20; //20MB 파일 사이즈 설정 
    String str = null;
    String filename = null;	//업로드한 파일이름, 서버에 중복된 파일 이름이 존재할 경우 처리하기 위해-originalFileName
    String original_filename = null;
    
    
    //cos.jar라이브러리 클래스를 가지고 실제 파일을 업로드하는 과정
    try{
    	// defaultFileRenamePolicy 처리는 중복된 이름이 존재할 경우 처리할 때
    	//request, 파일저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책
    	MultipartRequest multiRequest = new MultipartRequest(request, path, size, "EUC-KR", new DefaultFileRenamePolicy());
    	
    	
    	//전송한 전체 파일이름들을 가져온다. 
    	Enumeration files = multiRequest.getFileNames();
    	str = (String)files.nextElement();
    	
    	//파일명 중복이 발생했을 때 정책에 의해 뒤에 1,2,3 처럼 숫자가 붙어 고유 파일명을 생성한다.
    	//이때 생성된 이름을 FilesystemName이라고 하여 그 이름 정보를 가져온다. (중복처리)
    	filename = multiRequest.getFilesystemName(str);
    	//실제 파일 이름을 가져온다. 
    	original_filename = multiRequest.getOriginalFileName(str);
    	
    	System.out.println("str : "+str);
    	System.out.println("filename : "+filename);
    	System.out.println("original_filename : "+original_filename);
    } catch (Exception e){
    	e.printStackTrace();
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		파일 불러오기 : <%=original_filename%>
		파일 불러오기 : <%=str%>
		
</body>
</html>