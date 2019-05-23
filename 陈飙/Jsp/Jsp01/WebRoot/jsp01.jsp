
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>9*9乘法表</title>
    
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
    <%		/* String a=null;
    		out.print(100);
    		out.print(a);
    		//out.println("<br/>");
    		out.write("<br/>");
    		out.write(97);
    		out.write("\n"); */
    		out.print("<table border=1>");
    			for(int i=1;i<=9;i++){
    				out.print("<tr>");
    					for(int j=1;j<=i;j++){
    						out.print("<td>");
    							out.print(i);
    							out.print("*");
    							out.print(j);
    							out.print("=");
    							out.print(i*j);
    						out.print("</td>");
    					}
    				out.print("</tr>");
    			}
    		out.print("</table>");
     %><br>
  </body>
</html>
