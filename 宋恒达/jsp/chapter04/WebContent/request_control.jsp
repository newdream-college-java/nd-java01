<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
		String[] sport=request.getParameterValues("sport");
		List<String> lists=new ArrayList<String>();
		for(String s:sport){
			lists.add(s);	
		}
		session.setAttribute("sports", lists);
		response.sendRedirect("request_show.jsp");
	%>
</body>
</html>