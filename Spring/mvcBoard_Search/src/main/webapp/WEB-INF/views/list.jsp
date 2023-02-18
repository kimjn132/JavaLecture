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
	<h1>게시판 주소록 검색</h1>
	
	<form action="listSearch">
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
	
		<c:set var="cnt" value="0" /> 
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>전화번호</td>
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
		
		<c:set var="cnt" value="${cnt = cnt+1}" /> 
		</c:forEach>
		<tr>
			<td colspan="5"> <a href="write_view">주소록 등록</a> </td>
		</tr>
	</table>
		총 인원은 ${cnt} 명 입니다.


</body>
</html>