<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성</title>
</head>
<body>
	<h2>글작성</h2>
	<form action="write.do" method="post" enctype="multipart/form-data">
		<table border="0">
			<%--enctype은 method 속성이 POST일 때 사용이 가능하다. multipart/form-data는 모든 문자를 인코딩 하지 않음을 명시한다, 주로 파일이나 이미지를 서버로 전송할 때 사용 --%>
	
		<%--input 타입의 type 속성으로 file을 주어서 파일을 선택할 수 있다. --%>
			
			<tr>
				<td>사진</td>
				<td><input type="file" name="filename"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName" size="20"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle" size="50"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="bContent" rows="10" cols="50"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력">&nbsp;&nbsp;&nbsp;<a href="list.do">목록보기</a></td>
			</tr>
			
		
		</table>
	
	</form>
</body>
</html>