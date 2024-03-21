<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Cookie[] cookies = request.getCookies();
boolean login = false;
String userId = null;
if (cookies != null) {
	for (Cookie c : cookies) {
		if (c.getName().equals("Auth")) {
	login = true;
	userId = c.getValue();
		}
	}
}
String pageNum = request.getParameter("page");
String url = "service" + pageNum + ".jsp";

request.setAttribute("userId", userId);

if (login) {
	request.getRequestDispatcher(url)
		.forward(request, response);
} else {
	request.getRequestDispatcher("needlogin.jsp")
		.forward(request, response);
}
%>








