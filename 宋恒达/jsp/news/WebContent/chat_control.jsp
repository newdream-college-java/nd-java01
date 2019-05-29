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
		List<String> lists=new ArrayList<String>();
		if(application.getAttribute("chatInfo")!=null){
			lists=(List<String>)application.getAttribute("chatInfo");
		}
		String info=request.getParameter("info");
		lists.add(info);
		application.setAttribute("chatInfo", lists);
		response.sendRedirect("chat.jsp");
	%>
</body>
</html>