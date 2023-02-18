<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<table class="container card" style="height: 400px;" border="1">
	<tr>
		<th>hSeq</th><th>hId</th>
	</tr>
	<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.hSeq }</td><td>hSeq</td>
		</tr>
	</c:forEach>
</table>

<%-- 페이지 버튼 --%>
<div class="btn-toolbar mb-3" role="toolbar" aria-label="Toolbar with button groups">
	<div class="btn-group me-2" role="group" aria-label="First group">
	<form action="list2.do" method="get">

<%

request.setCharacterEncoding("utf-8");
int pageCount = Integer.valueOf(request.getAttribute("pageCount").toString()); 

%>

	<c:forEach begin="1" end="<%=pageCount %>" var="pageCount" step="1" varStatus="vs"> 
		<input type="submit" name="page" value="${vs.count}" class="btn btn-outline-secondary">
	</c:forEach>
	</form>
	</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>