<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		Context context=new InitialContext();
		DataSource dataSource=(DataSource)context.lookup("java:comp/env/jdbc/news");
		for(int i=0;i<100;i++){
			Connection conn=dataSource.getConnection();
			out.print(conn+"<br/>");
		}
	%>
</body>
</html>