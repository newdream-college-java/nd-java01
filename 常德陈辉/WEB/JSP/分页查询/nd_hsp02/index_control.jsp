<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'index_control.jsp' starting page</title>

	</head>

	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String name = request.getParameter("uname");
			String pwd = request.getParameter("upwd");
			//out.print(name+pwd);
			if (name.equals("陈辉") && pwd.equals("123")) {
				session.setAttribute("name", name);
				response.sendRedirect("index.jsp");
			}else{
				out.print("<script>alert('账号错误');location.href='index.jsp'</script>");
			}
		%>
	</body>
</html>
