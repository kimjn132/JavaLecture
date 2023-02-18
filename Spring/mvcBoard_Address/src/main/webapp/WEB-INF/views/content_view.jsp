<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table cellpadding="0" cellspacing="0" border="1">
		<form action="modify" method="post">
			<input type="hidden" name="seq" value="${content_view.seq}">
			<tr>
				<td> 번호 </td>
				<td> <input type="text" name="seq" size = "50" value="${content_view.seq}"> </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="name" size = "50" value="${content_view.name}"> </td>
			</tr>
			<tr>
				<td> 전화번호 </td>
				<td> <input type="text" name="tel" size = "50" value="${content_view.tel}"> </td>
			</tr>
			<tr>
				<td> 주소 </td>
				<td> <input type="text" name="address" size = "50" value="${content_view.address}"> </td>
			</tr>
			<tr>
				<td> 전자우편 </td>
				<td> <input type="text" name="email" size = "50" value="${content_view.email}"> </td>
			</tr>
			<tr>
				<td> 관계 </td>
				<td> <input type="text" name="relation" size = "50" value="${content_view.relation}"> </td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="수정"> &nbsp;&nbsp; <a href="list">목록보기</a> &nbsp;&nbsp; <a href="delete?seq=${content_view.seq}">삭제</a> &nbsp;&nbsp; </td>
			</tr>
		</form>
	</table>


</body>
</html>