<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제완료</title>
</head>
<body>
	<h2>결제완료</h2>
	<form action="order.do" method="post">
	<input type="hidden" name="cId" value="<%=session.getAttribute("CID") %>">
		<table border="0">
			<tr>
				<td>사용자</td>
				<td><%=session.getAttribute("CID") %></td>
			</tr>
			
		
			<tr>
				<td>제품번호</td>
				<td><input type="text" name="tel" size="50" value="<%=session.getAttribute("PID")%>"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" size="50" value="${customer.cAddress}"></td>
			</tr>
			<tr>
				<td>전자우편</td>
				<td><input type="text" name="email" size="50" value="${customer.cEmail}"></td>
			</tr>
			<tr>
				<td>결제 제품</td>
				<td><input type="text" name="productName" size="50" value="${detail.pName}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;&nbsp;<a href="list.do">주소록보기</a>
				&nbsp;&nbsp;&nbsp;<a href="delete.do?seq=${content_view.seq}">삭제</a></td>
			</tr>
			
		
		</table>
	
	</form>
</body>
</html>