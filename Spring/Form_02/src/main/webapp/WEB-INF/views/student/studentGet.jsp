<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/student/showStudent" method = "get">
	<h2>Get</h2>
	
	student id : <input type="text" name="studentId">
	<input type="submit">
	</form>
	
	<form action="/student/showStudent" method = "post">
	<h2>Post</h2>
	
	student id : <input type="text" name="studentId">
	<input type="submit">
	</form>
</body>
</html>