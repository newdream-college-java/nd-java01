<%@page import="java.util.List"%>
<%@page import="cn.song.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="loginControl.jsp"%>
<body>
	<%
		String name=(String)session.getAttribute("uname");
		String pwd=(String)session.getAttribute("upwd");
		User user=new User();
		user.setUname(name);
		user.setUpwd(pwd);
		List<User> lists=(List<User>)application.getAttribute("loginUser");
		for(int i=0;i<lists.size();i++){
			if(lists.get(i).getUname().equals(name)){
				lists.remove(i);
			}
		}
		application.setAttribute("loginUser", lists);	
		session.invalidate();
		response.sendRedirect("index.jsp");
	%>
</body>
</html>