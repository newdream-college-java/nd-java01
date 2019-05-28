<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'getCookies.jsp' starting page</title>
    
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
    	//创建一个Cookie数组，用来存放addCookie.jsp中放在大Cookie中的键值对
    	Cookie[] cookies = request.getCookies();
    	//创建两个变量分别存放用户账户和密码
    	String name = null;
    	String pwd = null;
    	//用增强for遍历需要的用户名和密码
    	for(Cookie cookie:cookies){
    		if(cookie.getName().equals("uname")){
    			name = cookie.getValue();
    		}
    		if(cookie.getName().equals("pwd")){
    			pwd = cookie.getValue();
    		}
    	}
    	//将得到的账号和密码输出在网页中
    	out.print("用户名："+name+",\t密码："+pwd);
    %>
  </body>
</html>
