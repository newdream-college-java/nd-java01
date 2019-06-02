<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
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
    <form action="upload_control.jsp" method="post" enctype="multipart/form-data" >&nbsp; 
    <table>
    	<tr><td>用户姓名：<input type="text" name="uname" value="新梦想"/></td></tr>
    	<tr><td>上传头像1：<input type="file" name="photo1"/></td></tr>
    	<tr><td>上传头像2：<input type="file" name="photo2"/></td></tr>
    	<tr><td><input type="submit" value="提交" /></td></tr>
    </table>
    </form>
  </body>
</html>
