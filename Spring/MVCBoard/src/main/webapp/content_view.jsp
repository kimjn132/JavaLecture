<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정 및 삭제</title>


</head>
<body>
	<h2>글 수정 및 삭제</h2>
	<form action="modify.do" method="post">
	<input type="hidden" name="bId" value="${content_view.bId}">
		<table border="0">
			<tr>
				<td>번호</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName" size="20" value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle" size="50" value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="bContent" rows="10" cols="50">${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<td>사진</td>
				<td><input type="text" name="bImage" size="30" value="${content_view.bImage}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;&nbsp;<a href="list.do">목록보기</a>
				&nbsp;&nbsp;&nbsp;<a href="delete.do?bId=${content_view.bId}">삭제</a></td>
			</tr>
			
		
		</table>
	
	</form>
</body>
</html>