<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'callMessage.jsp' starting page</title>
    
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
    	request.setCharacterEncoding("utf-8");
    	String tl=request.getParameter("lt").trim();
    	List<String> list=new ArrayList<String>();
    	if(application.getAttribute("t1")!=null){
    		list=(List<String>)application.getAttribute("t1");
    	}
    	list.add(tl);
    	application.setAttribute("t1",list);
    	//application.removeAttribute("t1");
    	response.sendRedirect("index.jsp");
     %>
  </body>
</html>
