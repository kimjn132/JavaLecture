<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Address</title>
</head>
<body>
	<h1>게시판 주소록</h1>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>내용</td>
			<td>주소</td>
			<td>전자우편</td>
			<td>관계</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.seq}</td>
			<td><a href="content_view?seq=${dto.seq}">${dto.name}</a></td>
			<td>${dto.tel}</td>
			<td>${dto.address}</td>
			<td>${dto.email}</td>
			<td>${dto.relation}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"> <a href="write_view">주소록 등록</a> </td>
		</tr>
	</table>


</body>
</html>