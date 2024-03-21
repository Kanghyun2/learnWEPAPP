<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문서 제목</title>
</head>
<body>
<%
	// scriptlet 영역 (java 코드 작성)
	System.out.println("사용자 요청시 tomcat");
	System.out.println("(Server-side)에서 실행됩니다.");
%>
	<p>문단 내용</p>
</body>
<script>
	console.log("응답 페이지를 전달받은 브라우저");
	console.log("(Client-side)에서 실행됩니다.");
</script>
</html>