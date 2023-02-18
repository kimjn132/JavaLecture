<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 주소록</title>
<body>
</head>
  
	<h1>MVC 주소록</h1>
		<form action="search.do">
		검색 선택:
		<select name="query">
			<option value="name">이름</option>
			<option value="tel">전화번호</option>
			<option value="address" selected="selected">주소</option>
			<option value="relation">관계</option>
		</select>&nbsp;&nbsp;&nbsp;
		<input type="text" name="content" size="30">
		<input type="submit" value="검색"> 
	</form>
	<table border="1">
		<tr>
			<th>번호</th><th>이름</th><th>전화번호</th><th>주소</th><th>전자우편</th><th>관계</th>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td><a href="content_view.do?seq=${dto.seq}">${dto.seq}</a></td>
				<td>${dto.name}</td>
				<td>${dto.tel}</td>
				<td>${dto.address}</td>
				<td>${dto.email}</td>
				<td>${dto.relation}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">주소록등록</a></td>
		</tr>
	</table>

   	
</body>
</html>