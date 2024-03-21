<%@page import="app07.content.Content"%>
<%@page import="java.util.List"%>
<%@page import="app07.content.ContentRepo"%>
<%@page import="app07.component.NavComponent"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서비스 콘텐츠 제공 페이지</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<%
	ContentRepo repo = new ContentRepo();
	List<Content> list = repo.getAll();
	%>
	<c:set var="contents" value="<%=list%>"></c:set>
	<c:choose>
		<c:when test="${ auth != null }">
			<p>${ auth }님반갑습니다.</p>
			<c:forEach var="c" items="${ contents }">
				<article>
					<h3>${ c.no }:${ c.heading }</h3>
					<p>${ c.text }</p>
				</article>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<p>로그인을 먼저 해주세요.</p>
		</c:otherwise>
	</c:choose>
</body>
</html>