<%@page import="app07.content.Content"%>
<%@page import="app07.content.ContentRepo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String heading = request.getParameter("heading");
	String text = request.getParameter("text");

	if (heading == null || heading.trim().equals("")){
		
	}
	if (heading.length() > 50) {
		
	}
	ContentRepo repo = new ContentRepo();
	int result = repo.write(new Content(heading, text));
	
	response.sendRedirect("contentcontrol.jsp");
%>