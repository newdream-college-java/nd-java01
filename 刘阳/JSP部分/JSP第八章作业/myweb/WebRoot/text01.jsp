<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" import="java.util.*,javax.naming.*,javax.sql.*,java.sql.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'text01.jsp' starting page</title>
    
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
    	Context ctx=new InitialContext();//得到上下文对象
    	DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbcNews");//从上下文获取数据源（连接池）
    	Connection conn=ds.getConnection();//从连接池得到连接
    	out.print(conn);//输出查看是否得到连接
    	conn.close();//关流
     %>
  </body>
</html>
