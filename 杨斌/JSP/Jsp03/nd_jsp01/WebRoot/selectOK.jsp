<%@ page language="java" import="java.util.*,com.cc.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'toInsert.jsp' starting page</title>
    
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
  <table align="center" width="30%" border="1">
  <tr>
  	<th>姓名</th>
  	<th>密码</th>
  	<th>金钱</th>
  </tr>
  <%
   List<Master> list=(List<Master>)request.getAttribute("master");
  	for(Master master:list){
  		out.print("<tr>");
  		out.print("<td>");
  		out.print(master.getName());
  		out.print("</td>");
  		out.print("<td>");
  		out.print(master.getPass());
  		out.print("</td>");
  		out.print("<td>");
  		out.print(master.getMoney());
  		out.print("</td>");
  		out.print("</tr>");
  	}
  
   %>
   
    </table>
  </body>
</html>
