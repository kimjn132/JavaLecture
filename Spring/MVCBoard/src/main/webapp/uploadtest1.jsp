<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���Ͼ��ε�</title>
</head>
<body>
		<%--enctype�� method �Ӽ��� POST�� �� ����� �����ϴ�. multipart/form-data�� ��� ���ڸ� ���ڵ� ���� ������ ����Ѵ�, �ַ� �����̳� �̹����� ������ ������ �� ��� --%>
	<form action="uploadCheck.jsp" method="post" enctype="multipart/form-data">
		<%--input Ÿ���� type �Ӽ����� file�� �־ ������ ������ �� �ִ�. --%>
		<input type="file" name="file"><br>
		<input type="submit" value="Upload">
	</form>
</body>
</html>