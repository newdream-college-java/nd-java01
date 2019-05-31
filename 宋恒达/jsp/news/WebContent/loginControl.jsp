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
		if (session.getAttribute("uname") == null) {
			out.print("<script>alert('您尚未登录不允许访问！');location.href='index_controler.jsp';</script>");
		}
	%>
</body>
</html>