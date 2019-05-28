<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'request_control.jsp' starting page</title>
	</head>

	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String[] likes=request.getParameterValues("like");
			//out.print(likes[0]);
			ArrayList<String> list=new ArrayList<String>();
			for(int i=0;i<likes.length;i++){
				list.add(likes[i]);
			}
			session.setAttribute("likes",list);
			response.sendRedirect("request_show.jsp");
		%>
	</body>
</html>
