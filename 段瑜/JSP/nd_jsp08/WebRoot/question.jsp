<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'question.jsp' starting page</title>
    
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
    <form action="question_control.jsp" method="post">
    	调查问卷<br/>
    	昵称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="uname"/><br/>
    	所在城市：<input type="text" name="city" /><br/>
    	开发语言：<input type="checkbox" name="laugh" value="JAVA"/>JAVA
    				<input type="checkbox" name="laugh" value="C"/>C
    				<input type="checkbox" name="laugh" value="C++"/>C++
    				<input type="checkbox" name="laugh" value="PHP"/>PHP<br/>
    			<input type="submit" value="提交">
    </form>
  </body>
</html>
