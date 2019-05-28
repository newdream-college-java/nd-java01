<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'request_show.jsp' starting page</title>

	</head>

	<body>
		<%
			request.setCharacterEncoding("utf-8");
			out.print("您选择的兴趣爱好是：");
			ArrayList<String> likes=(ArrayList<String>)session.getAttribute("likes");
			for(int i=0;i<likes.size();i++){
				out.print("<br/>");
				out.print(likes.get(i));
			}
		 %>
	</body>
</html>
