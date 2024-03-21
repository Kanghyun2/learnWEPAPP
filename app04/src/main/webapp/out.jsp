<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력 연습</title>
</head>
<body>
	<%
	for (int i = 1; i <= 10; i++) {
	%>
			<p><%=i%></p>
	<%
	}
	%>

	<hr>

	<%
	for (int i = 21; i <= 30; i++) {
		out.println("<p>" + i + "</p>");
	}
	%>
</body>
</html>