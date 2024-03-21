<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el 속성 출력</title>
</head>
<body>
	<%
		request.setAttribute("req", "요청 객체 스코프");
		session.setAttribute("session", "세션 객체 스코프");
		application.setAttribute("app", "어플리케이션 객체 스코프");
	%>
	<p><%= request.getAttribute("req") %></p>
	<p><%= session.getAttribute("req") %></p>
	<p><%= application.getAttribute("req") %></p>
	<hr>
	<p>${ req }</p>
	<p>${ session }</p>
	<p>${ app }</p>
	<p>${ nonExist }</p>
</body>
</html>