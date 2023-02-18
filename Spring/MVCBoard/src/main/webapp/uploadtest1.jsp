<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>파일업로드</title>
</head>
<body>
		<%--enctype은 method 속성이 POST일 때 사용이 가능하다. multipart/form-data는 모든 문자를 인코딩 하지 않음을 명시한다, 주로 파일이나 이미지를 서버로 전송할 때 사용 --%>
	<form action="uploadCheck.jsp" method="post" enctype="multipart/form-data">
		<%--input 타입의 type 속성으로 file을 주어서 파일을 선택할 수 있다. --%>
		<input type="file" name="file"><br>
		<input type="submit" value="Upload">
	</form>
</body>
</html>