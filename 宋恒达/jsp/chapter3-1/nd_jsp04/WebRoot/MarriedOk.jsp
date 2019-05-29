<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>3.发结果的人</title>
    
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
    <font color="red" size="7">
    		转发过来的数据为：钞票：<%out.print(request.getAttribute("money")); %><br/>
    					   美人：<%out.print(request.getAttribute("girl")); %><br/>
    		------恭喜你，结婚成功！！  欢迎下次再来！！！
    </font>
  </body>
</html>
