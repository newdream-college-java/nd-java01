<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int luck=((int)(Math.random()*10));
		session.setAttribute("luck", luck);
		response.sendRedirect("showLuckNum.jsp");
	%>
</body>
</html>