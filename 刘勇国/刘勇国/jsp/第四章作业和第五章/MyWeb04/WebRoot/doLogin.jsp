<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doLogin.jsp' starting page</title>
    
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
    //改变传过来的用户名和密码的编码格式
    request.setCharacterEncoding("utf-8");
    //用变量保存它们
    String uname=request.getParameter("uname");
    String psw=request.getParameter("psw");
    Cookie cookie1=null;
    if(uname.equals("sa")&&psw.equals("123")){
    	cookie1=new Cookie("username",uname);
    	cookie1.setMaxAge(5);
    	response.addCookie(cookie1);
    	response.sendRedirect("welcome.jsp");
    }else{
    	out.print("<script>javascript:alert('用户名和密码不匹配，请返回重新输入');location.href='login.jsp'</script>");
    }
     %>
  </body>
</html>