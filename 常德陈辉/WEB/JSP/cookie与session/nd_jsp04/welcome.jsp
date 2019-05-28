<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'welcome.jsp' starting page</title>
    

  </head>
  
  <body>
    	<%	
    		Cookie[] cookies=request.getCookies();
    		String name="a";
    		for(Cookie cookie:cookies){
    			if(cookie.getName().equals("name")){
    				name=cookie.getValue();
    			}
    		}
    		if(name.equals("sa")){
    			out.print("欢迎您："+name);
    		}else{
    			out.print("抱歉！您已超时退出，请重新返回<a href='login.jsp'>登录</a>");
    		}
    	 %>
  </body>
</html>
