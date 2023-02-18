<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	(function() {
		var _DOM = document.createElement('script');
		_DOM.src = 'https://www.paypalobjects.com/api/checkout.js';
		var element = document.getElementsByTagName('script')[0];
		element.parentNode.insertBefore(_DOM, element);
	});

	
</script>

</head>
<body>
	<div id="pay-test-btn">Test to payment</div>
</body>
</html>