<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="BaseDao.imgl.NewsDaoImgl"%>
<%@include file="Dao.jsp" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index_cont.jsp' starting page</title>
    
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
		String uapg=request.getParameter("apg");
    	int apg=1; 
    	int bpg=3; 
    	NewsDaoImgl  nd=new NewsDaoImgl();
    	if(uapg!=null){
    		apg=Integer.parseInt(uapg);
    	}
    	List<News> list=(ArrayList<News>)nd.select(apg,bpg);
    	int count=nd.conts(bpg);
    	if(list.size()>0){
    		request.setAttribute("apg",apg);
    		request.setAttribute("list",list);
    		request.setAttribute("count",count);
    		request.setAttribute("bpg",bpg);
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    	}else{
    		request.getRequestDispatcher("index.jsp");
    	}
    	
     %>
  </body>
</html>
