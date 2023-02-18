<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.io.*"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// ������ ������ ����Ǵ� path
    String path = request.getRealPath("uploadedFiles");
    int size = 1024 * 1024 * 20; //20MB ���� ������ ���� 
    String str = null;
    String filename = null;	//���ε��� �����̸�, ������ �ߺ��� ���� �̸��� ������ ��� ó���ϱ� ����-originalFileName
    String original_filename = null;
    
    
    //cos.jar���̺귯�� Ŭ������ ������ ���� ������ ���ε��ϴ� ����
    try{
    	// defaultFileRenamePolicy ó���� �ߺ��� �̸��� ������ ��� ó���� ��
    	//request, ����������, �뷮, ���ڵ�Ÿ��, �ߺ����ϸ� ���� ��å
    	MultipartRequest multiRequest = new MultipartRequest(request, path, size, "EUC-KR", new DefaultFileRenamePolicy());
    	
    	
    	//������ ��ü �����̸����� �����´�. 
    	Enumeration files = multiRequest.getFileNames();
    	str = (String)files.nextElement();
    	
    	//���ϸ� �ߺ��� �߻����� �� ��å�� ���� �ڿ� 1,2,3 ó�� ���ڰ� �پ� ���� ���ϸ��� �����Ѵ�.
    	//�̶� ������ �̸��� FilesystemName�̶�� �Ͽ� �� �̸� ������ �����´�. (�ߺ�ó��)
    	filename = multiRequest.getFilesystemName(str);
    	//���� ���� �̸��� �����´�. 
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
		���� �ҷ����� : <%=original_filename%>
		���� �ҷ����� : <%=str%>
		
</body>
</html>