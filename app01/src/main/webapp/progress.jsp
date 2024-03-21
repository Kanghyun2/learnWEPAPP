<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	// scriptlet
	// 자바 코드 적을 수 있어용
	int a = 10;
	System.out.println("사용자 페이지 요청");
	
	String id = request.getParameter("uid");
	String pw = request.getParameter("upw");
	
	boolean result = id.equals("qwer") && pw.equals("qwer");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과 페이지</title>
</head>
<body>
	<p>결과: <%= result %></p>
</body>
</html>