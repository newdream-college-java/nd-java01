<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>Cookie.jsp</title>
    
	

  </head>
  
  <body>  
    <%
    //总结出来就是
    //1.创建cookie并保存数据，可以用setMaxAge(0)消除cookie
    Cookie cookie=new Cookie("name","12");//注意Key:只能是字符串，value只能是字符串
    //2.将cookie发送客户端//因为cookie的数据是保存在网页上的，所以要咋另一个页面请求它得到值
    response.addCookie(cookie);//add表示可以添加多个，set是设置值，只能设置一个值）
    /* Cookie[] cookies=request.getCookies();
    	for(Cookie cookie01:cookies){
    		//此处一定要客户端访问了cookie服务器就保存了一个cookie文件，然后才能在showcookie才能查询到上一个cookie文件，不然直接是不会出现上一cookiew文件
    		out.print(cookie01.getName()+"-----"+cookie01.getValue()+"<br/>");
    		out.print(cookie01.getMaxAge()+"<br/>");
    		out.print(cookie01.getPath()+"<br/>");
    	} */
    //3.跳转到showCookie.jsp
   response.sendRedirect("showCookie.jsp");
     %> <br>
  </body>
</html>
