<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆验证</title>
    
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
    	//设置编码格式
    	request.setCharacterEncoding("utf-8");
    	//获取从login.jsp传递的过来的值
    	String name = request.getParameter("uname");
    	String pwd = request.getParameter("pwd");
    	//创建一个Cookie用来存放发过来的值
    	Cookie uCookie;
    	if(name.equals("sa")&&pwd.equals("123")){
	    	uCookie = new Cookie("uname",name);
	    	//设置uCookie的有效时间为5秒钟
	    	uCookie.setMaxAge(5);
	    	//注意：切勿先将uCookie放入响应否则无法达到需要的效果
	    	response.addCookie(uCookie);
	    	//以重定向方式发送
   	 		response.sendRedirect("welcome.jsp");
    	}else{
    		//登录失败弹窗提示
    		out.println("<script>alert('登陆失败，用户名或密码错误！');location.href='login.jsp'</script>");
    	}
    	
    	
   %>
  </body>
</html>
