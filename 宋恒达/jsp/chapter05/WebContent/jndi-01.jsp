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
		Context context=new InitialContext();
		String dbName=(String)context.lookup("java:comp/env/dbName");
		String username=(String)context.lookup("java:comp/env/user");
		String password=(String)context.lookup("java:comp/env/pass");
		out.print(dbName+"<br/>");
		out.print(username+"<br/>");
		out.print(password+"<br/>");
	%>
</body>
</html>