<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring movies</title>
</head>
<body>
	<h1>영화 검색</h1>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		
		<c:set var="cnt" value="0" /> 
		<tr>
			<td>영화 이미지</td>
			<td>영화 제목</td>
			
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td><img src="${dto.image}"></td>
			<td>${dto.title}</td>
		</tr>
		<c:set var="cnt" value="${cnt = cnt+1}" /> 
		</c:forEach>
		
	</table>
검색 결과는 ${cnt}건 입니다.

</body>
</html>