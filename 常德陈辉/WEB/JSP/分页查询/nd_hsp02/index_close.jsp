<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'index_close.jsp' starting page</title>

	</head>

	<body>
		<%
			session.removeAttribute("name");
			response.sendRedirect("index.jsp");
		 %>
	</body>
</html>
