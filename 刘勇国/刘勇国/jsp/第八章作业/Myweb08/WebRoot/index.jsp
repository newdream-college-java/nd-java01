<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  		<form action="callMessage.jsp" method="post">
    	输入聊天信息：<br/>
    	<textarea rows="10" cols="40" name="lt"></textarea>
		<br/>
		<input type="submit" value="确认" />
		<input type="reset" value="重置" />
		</form>
		<br/>
		<hr/>
		输入聊天信息：<br/>
    	<textarea rows="10" cols="40"><%
			if(application.getAttribute("t1")!=null){
				List<String> h1=(List<String>)application.getAttribute("t1");
				for(int i=0;i<h1.size();i++){
					out.print(h1.get(i)+"\n");
				}
			}
		 %></textarea>
		
  </body>
</html>