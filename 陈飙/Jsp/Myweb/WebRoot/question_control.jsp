<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>question_control.jsp</title>
    
	

  </head>
  
  <body>
  问卷调查<br>
  <form action="question.jsp" method="post">
  昵称 ：<input type="text" name="username"><br>
  所在城市：<input type="text" name="address"><br>
 开发语言：<input type="checkbox" value="java" name="box">java
 		<input type="checkbox" value="C" name="box">C
 		<input type="checkbox" value="C++" name="box">java
 		<input type="checkbox" value="java" name="box">PHP<br>
 		<input type="submit" value="提交">
 		</form>
  </body>
</html>
