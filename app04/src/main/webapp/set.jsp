<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>어플리케이션 기본 객체 활용</title>
</head>
<body>
	<%
		application.setAttribute("myAttr", "속성값");
	%>
	<p>어플리케이션 객체에 속성을 생성했습니다.</p>
</body>
</html>