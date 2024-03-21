<%--
	1. 사이트 목적 (페이지간 이동 링크 제공)
	2. 웹서비스 제공 페이지 (로그인 상태 체크)
	3. 회원가입 폼
	4. 회원가입 처리 페이지 (입력값 유효 확인)
	5. 로그인 폼
	6. 로그인 처리 페이지 (입력값 유효 확인)
 --%>

<%@page import="app07.component.NavComponent"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<img src="image/헬스토매통.png" alt="토마토 사진">
</body>
</html>