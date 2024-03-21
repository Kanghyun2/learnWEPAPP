<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버 구성 정보 확인</title>
</head>
<body>
	<%
		String v = application.getInitParameter("myParam");
	%>
	<p><%= v %></p>
	<p><%= application.getServerInfo() %></p>
	<p><%= application.getResource("numberform.html") %></p>
	<p>설정된 속성 값 확인: <%= application.getAttribute("myAttr") %></p>
</body>
</html>