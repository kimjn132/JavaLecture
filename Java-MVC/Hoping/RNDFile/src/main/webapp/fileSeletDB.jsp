<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>단일 파일 업로드</title>
</head>

<body>

<h3>File Upload:</h3>
Select a file to upload: <br />
<form action = "fileUpload.jsp" method = "post" enctype = "multipart/form-data">
	<input type = "file" name = "file" size = "50" />
	<br>
	<input type = "submit" value = "Upload File" />
</form>

</body>
</html>