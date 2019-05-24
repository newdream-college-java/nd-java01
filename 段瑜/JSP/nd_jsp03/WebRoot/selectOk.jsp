<%@ page language="java" import="java.util.*,entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'selectOk.jsp' starting page</title>
    
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
    	List<Stu_info> list=(List<Stu_info>)request.getAttribute("list");
    	for(Stu_info info:list){
    		System.out.print(info.getSid()+"\t"+info.getSname()+"\t"+info.getSage()+"\t"+info.getSbirthday());
    	}
     %>
     <table align="center" border="1" width="60%">
    		<tr>
    			<th>编号</th>
    			<th>姓名</th>
    			<th>年纪</th>
    			<th>生日</th>
    		</tr>
    		<%for(Stu_info info:list){ %>
    		<tr>
    			<th><%=info.getSid()%></th>
    			<th><%=info.getSname()%></th>
    			<th><%=info.getSage()%></th>
    			<th><%=info.getSbirthday()%></th>
    		</tr>
    		<%} %>
    	</table>
  </body>
</html>
