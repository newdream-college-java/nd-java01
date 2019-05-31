<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>登录退出</title>
    
	
  </head>
  
  <body>
    <%
    //1.获取值
    String uname=(String)session.getAttribute("uname");
   // session.removeAttribute("uname");//移除键
    List loginusers=new ArrayList();
    if(application.getAttribute("logined_user")!=null){
    loginusers=(ArrayList)application.getAttribute("logined_user");
   		//删除当前集合用户
    	loginusers.remove(uname);
    	application.setAttribute("logined_user", loginusers);
    }
    session.invalidate();
    response.sendRedirect("index.jsp");
    //2. %> <br>
  </body>
</html>
