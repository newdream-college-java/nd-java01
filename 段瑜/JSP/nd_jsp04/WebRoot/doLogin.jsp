<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="utf-8"%>
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
    	request.setCharacterEncoding("utf-8");
    	String uname=request.getParameter("uname");
    	String upwd=request.getParameter("upwd");
    	if(uname.equals("sa")&&upwd.equals("123")){
    		Cookie cookie1=new Cookie("uname",uname);
    		cookie1.setMaxAge(5);
    		response.addCookie(cookie1);
    		response.sendRedirect("welcome.jsp");
    	}else{
    		out.print("<script>javascript:alert('用户名错误');location.href='login.jsp'</script>");
    	}
     %>
  </body>
</html>
