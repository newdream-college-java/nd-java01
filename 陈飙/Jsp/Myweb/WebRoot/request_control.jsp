<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>request_control.jsp</title>



</head>

<body>
	<%
		request.setCharacterEncoding("utf-8");
		String[] like = request.getParameterValues("box");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < like.length; i++) {
			list.add(like[i]);
		}
		session.setAttribute("aihao", list);
		response.sendRedirect("request_show.jsp");
	%>
	<br>
</body>
</html>
