<%@ page language="java" import="java.util.*,biao1.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <%
   
   		request.setCharacterEncoding("utf-8");
   		String name=request.getParameter("yh");
   		String pwd=request.getParameter("mm");
 		yhcx yh=new yhcx();
 		boolean b=yh.getname(name,pwd);
 		if(b){
 			Cookie c=new Cookie("uname",name);
 			c.setMaxAge(5);
 			response.addCookie(c);
			//重定向  不可带数据
 			response.sendRedirect("welcome.jsp"); 
 			//转发  可以带数据
 			//request.getRequestDispatcher("welcome.jsp").forward(request, response);
 		}else{
 			out.print("没有这个人");
 		}
    %>
  </body>
</html>
