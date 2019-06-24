<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'aplication.jsp' starting page</title>
    
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
    <form action="aplication_control.jsp" method="post">
    请输入聊天信息：</br>
    <textarea rows="15" cols="50" name="tex"><%
    	
     %></textarea></br>
    <input type="submit" value="提交">
    </form>
    已有聊天记录：</br>
  <textarea rows="15" cols="50" ><%  if(application.getAttribute("texs")!=null){
    		List<String> lists=(ArrayList<String>)application.getAttribute("texs");
    		for(int i=0; i<lists.size();i++){
    			out.println(lists.get(i));
    		}
    	}%></textarea>
  </body>
</html>