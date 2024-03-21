<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!// 선언부는 메소드 정의가 가능
	public int plus(int a, int b) {
		return a + b;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부 활용</title>
</head>
<body>
	<%
		int sum = plus(10, 20);
	%>
	<p><%= plus(30, 40) %></p>
</body>
</html>