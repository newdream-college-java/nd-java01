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
		Cookie cookie1=new Cookie("name","Jack");
		Cookie cookie2=new Cookie("password","123456");
		cookie1.setMaxAge(60*60*24);
		cookie2.setMaxAge(60*60*24);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.sendRedirect("getCookies.jsp");
	%>
</body>
</html>