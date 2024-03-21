<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String id = (String) session.getAttribute("auth");
String role = (String) session.getAttribute("role");
%>
<nav>
	<a href="index.jsp">홈</a> <a href="service.jsp">서비스</a>
	<c:choose>
		<c:when test="${ auth == null }">
			<a href="loginform.jsp">로그인</a>
			<a href="signup.jsp">회원가입</a>
		</c:when>
		<c:when test="${ auth != null }">
			<a href="logout.jsp">로그아웃</a>
		</c:when>
	</c:choose>
		<c:if test="${ role == 'ADMIN' }">
			<a href="contentform.jsp">글쓰기</a>
			<a href="admin.jsp">관리자 메뉴로</a>
		</c:if>
</nav>