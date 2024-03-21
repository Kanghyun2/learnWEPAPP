<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력 기본 객체</title>
</head>
<body>
	<p>jsp에서 텍스트를 출력하는 방법으론</p>
	<p>정적 텍스트 작성</p>
	<%= "<p>표현식 작성</p>" %>
	<%	
		// 기본 객체
		out.println("<p>out 기본객체 활용</p>");
	%>
</body>
</html>