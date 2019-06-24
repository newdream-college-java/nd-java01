<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>showCookie.jsp</title>
    
	
  </head>
  
  <body>
    <%//1.cookie是长期保存在客服端的，可以用设置他的setMaxAge消除他，在之前一定要相应客户端
    //一次完整的请求，响应到客服端才能告知数据的操作
    	//1.获取客户端带过来的cookie  (request)()
    	Cookie[] cookies=request.getCookies();
    	for(Cookie cookie:cookies){
    		//此处一定要客户端访问了cookie服务器就保存了一个cookie文件，然后才能在showcookie才能查询到上一个cookie文件，不然直接是不会出现上一cookiew文件
    		out.print(cookie.getName()+"-----"+cookie.getValue()+"<br/>");
    		out.print(cookie.getMaxAge()+"<br/>");
    		out.print(cookie.getPath()+"<br/>");
    	}
    	//2.删除cookie
    	Cookie cookie=new Cookie("age","2");
    	cookie.setMaxAge(0);
    	
    	//3.跳转到deleteCookie.jsp
    	response.addCookie(cookie);//此处要告诉客服端删除，也就是删除执行的语句
    	/* Cookie[] cookies=request.getCookies();
    	for(Cookie cookie01:cookies){
    		//此处一定要客户端访问了cookie服务器就保存了一个cookie文件，然后才能在showcookie才能查询到上一个cookie文件，不然直接是不会出现上一cookiew文件
    		out.print(cookie01.getName()+"-----"+cookie01.getValue()+"<br/>");
    		out.print(cookie01.getMaxAge()+"<br/>");
    		out.print(cookie01.getPath()+"<br/>");
    	} */
    	response.sendRedirect("deleteCookie.jsp");
    	 %><br>
  </body>
</html>
