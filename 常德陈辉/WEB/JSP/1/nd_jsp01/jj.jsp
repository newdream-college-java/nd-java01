<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jj.jsp' starting page</title>
    
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
    This is my JSP page. <br>
    <% 
    	int sum=0;
    	out.print("<table>");
    	for(int i=1;i<10;i++){
    		out.print("<tr>");
    		for(int j=1;j<=i;j++){
    			sum=i*j;
    			out.print("<td style='border:1px solid green'>"+j+"x"+i+"="+sum+"</td>");
    		}
    		out.print("</tr>");
    	}
    	out.print("</table>");
    %>
  </body>
</html>
