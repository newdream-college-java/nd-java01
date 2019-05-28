<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>...</title>


	</head>

	<body>
		<%  
			request.setCharacterEncoding("utf-8");
			String name=request.getParameter("uname");
			String pwd=request.getParameter("pwd");
			if(name.equals("sa")&&pwd.equals("123")){
				Cookie cookie=new Cookie("name",name);
				cookie.setMaxAge(5);
				response.addCookie(cookie);
				response.sendRedirect("welcome.jsp");
			}else{
				out.print("<script>alert('修改失败！');location.href='login.jsp'</script>");
			}
			//out.print(name);
		 %>
	</body>
</html>
