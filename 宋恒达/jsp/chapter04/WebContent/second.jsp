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
		String a=request.getParameter("a");
		a=new String(a.getBytes("iso-8859-1"),"utf-8");
		String b=request.getParameter("b");
		b=new String(b.getBytes("iso-8859-1"),"utf-8");
		out.print("a===="+a+",b==="+b);
	%>
</body>
</html>