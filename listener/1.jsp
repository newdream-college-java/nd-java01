<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '1.jsp' starting page</title>
    
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
    session.getAttribute("count");
    session.getAttribute("online");
    System.out.print((session.getAttribute("online")));
    System.out.print(session.getAttribute("count")+"2");
    request.setAttribute("name","牙套");
    session.setAttribute("name1","牙套1");
    application.setAttribute("name2","牙套2");
    request.getRequestDispatcher("2.jsp").forward(request,response);
     %>>
  </body>
</html>
