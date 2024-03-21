<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 값 접근</title>
</head>
<body>
	<%
		String paramValue = request.getParameter("paramName");
	%>
	<p><%= paramValue %></p>
	<p>${ param.paramName }</p>
</body>
</html>