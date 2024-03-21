<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String userId = (String) request.getAttribute("userId");
	%>
	<p><%=userId%>님 반갑습니다.
	</p>
	<p>로그인을 해야만 사용가능한 페이지1</p>
	<a href="logout.jsp">로그아웃 하기</a> %>

</body>
</html>