<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="roleerror.jsp"%>
<%
String role = (String) session.getAttribute("role");
if (role == null || !role.equals("ADMIN")) {
	throw new RuntimeException("흐름을 깨는지 확인");
}
%>