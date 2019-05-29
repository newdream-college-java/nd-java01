<%@ page language="java" import="java.util.*,BaseDao.*,entity.*" pageEncoding="utf-8"%>
<%@page import="BaseDao.imgl.New_usersDaoImgl"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index_control.jsp' starting page</title>
    
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
    	String uname=request.getParameter("uname");
    	String upwd=request.getParameter("upwd");
    	New_usersDaoImgl use=new New_usersDaoImgl();
    	List list=new ArrayList();
    	if(application.getAttribute("uname")!=null){
    		list=(ArrayList)application.getAttribute("uname");
    	}
    	boolean find=use.login(uname,upwd);
    	if(find==true){
    		list.add(uname);
    		session.setAttribute("uname",uname);
    		session.setAttribute("upwd",upwd);
    		application.setAttribute("uname",list);
    		response.sendRedirect("index.jsp");
    	}else{
    		out.println("<script>alert('登录失败，请重新登录');location.href='index.jsp';</script>");
    	}
     %>
  </body>
</html>
