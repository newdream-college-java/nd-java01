<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	您选择的兴趣爱好是<br/>
	<%
		List<String> lists=(List<String>)session.getAttribute("sports");
		for(String s:lists){
			out.print(s+"<br/>");
		}
	%>
</body>
</html>