<%@ page language="java" import="java.util.*,com.cc.dao.imp.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'topic_add_control.jsp' starting page</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
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
  	News_usersDaoImp td=new News_usersDaoImp();
	boolean falg=td.getName(uname,upwd);
	if(falg){
		request.setAttribute("uname",uname);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}else{		
		out.print("<script>javascript:alert('登录失败，请重新登录');location.href='index.jsp'</script>");
	}
  %>
    
  </body>
</html>
