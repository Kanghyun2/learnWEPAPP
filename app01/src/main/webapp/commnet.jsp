<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주석을 포함한 페이지</title>
</head>
<body>
	<p>jsp (Java Server Page)는 컨테이너(tomcat)에 의해 컴파일되고</p>
	<p>사용자가 해당 페이지를 요청 시</p>
	<p>scriptlet 영역의 자바 문장을 순차적으로 실행합니다.</p>	
	<%--
		jsp에 주서을 작성하는 방법
		(컴파일 시기에 무시됩니다.
	--%>
	<!--
		html 주석은 정적인 내용이기 때문에,
		해당 내용은 Client에 전송이 됩니다.
		그래서, 민감한 정보를 담아서는 안됩니다.
	 -->
	 <%-- 표현식. 페이지에 출력할 텍스트 내용 --%>
	 <%= "문자열 리터럴 값" %>
	 <%= 10 %>
	 <%= 100.123 %>
	 <%= true %>
	 
	 <%= "<button>버튼</button>" %>
	 <button>버튼</button>
	 <%
	 	String var = "변수 초기화";
	 %>
	 <p>스크립트렛 영역에서 선언 초기화한 변수 값을 표현식으로 출력가능합니다. <%= var %></p>
</body>
</html>