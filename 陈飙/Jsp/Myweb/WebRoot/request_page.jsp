<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>request_page.jsp</title>
    
	

  </head>
  
  <body>
   <form action="request_control.jsp" method="post">
   请输入你的兴趣爱好<br/>
   <input type="checkbox" name="box" value="篮球">篮球<br>
   <input type="checkbox" name="box" value="足球">足球
   <input type="checkbox" name="box" value="电影">电影 
   <input type="checkbox" name="box" value="游戏">游戏<br/>
   <input type="submit" value="提交">
   </form>
  </body>
</html>
