<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
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
    	//创建一个Cookie的数组用来存放响应的值
	    Cookie[] cookies = request.getCookies();
	    //创建一个Cookie来查看是否有效
	    Cookie cookie = null;
    	for(Cookie coo:cookies){
    		if(coo.getName().equals("uname")){
    			//得到用户名的值
    			cookie = coo; 			
    		}else{   		
    		}
    	}
    	//    判断cookie中的值是否为空，非空就说明还有效，空就说明已经在时效了(上一界面doLogin.jsp
    	//    中已设定5秒有效时限)
    	if(cookie!=null){
    		out.print("欢迎你："+cookies[1].getValue());    			
   		}else{ 
    		out.print("抱歉！您已超时登陆,请重新返回<a href='login.jsp'>登录</a>");    		
   		}
    %>
  </body>
</html>
