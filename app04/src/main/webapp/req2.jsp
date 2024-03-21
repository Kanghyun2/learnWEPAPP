<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 객체 속성 값 설정</title>
</head>
<body>
	<p><%= request.getAttribute("reqAttr") %></p>
	<p><%= application.getAttribute("myAttr") %></p>
</body>
</html>