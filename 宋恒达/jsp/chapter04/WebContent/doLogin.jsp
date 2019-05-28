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
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String password=request.getParameter("pwd");
		Cookie cname=new Cookie("name",name);
		cname.setMaxAge(5);
		Cookie cpwd=new Cookie("pwd",password);
		cpwd.setMaxAge(5);
		response.addCookie(cname);
		response.addCookie(cpwd);
		response.sendRedirect("welcome.jsp");
	%>
</body>
</html>