<%@page import="app07.content.Content"%>
<%@page import="java.util.List"%>
<%@page import="app07.content.ContentRepo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="roleerror.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>컨텐츠 제어</title>
</head>
<body>
	<jsp:include page="rolecheck.jsp"></jsp:include>
	<%
	ContentRepo repo = new ContentRepo();
	List<Content> list = repo.getAll();
	%>
	<c:forEach var="c" items="<%= list %>">
		<div>
			<div>${c.heading}</div>
			<div>${c.text}</div>
			<c:url var="url" value="contentdelete.jsp">
				<c:param name="no" value="${ c.no }"></c:param>
			</c:url>
				<a href="${ url }">삭제하기</a>
		</div>
	</c:forEach>
</body>
</html>