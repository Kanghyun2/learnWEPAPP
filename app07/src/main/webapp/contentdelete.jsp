<%@page import="app07.content.ContentRepo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String no = request.getParameter("no");
int noPK = Integer.parseInt(no);

ContentRepo repo = new ContentRepo();
int result = repo.delete(noPK);

if (result == 1) {
	response.sendRedirect("contentcontrol.jsp");
}
%>
