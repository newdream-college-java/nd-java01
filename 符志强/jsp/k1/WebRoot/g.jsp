<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>1.发表格的人</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <form action="g1.jsp" method="post" >
    	<table>
    	<tr>
    		<td>修改后的姓名为：</td>
    		<td><input name="pname" type="text"/></td>
    	</tr>
    	    	<tr>
    		<td>修改后的年龄为：</td>
    		<td><input type="text" name="page"/></td>
    	</tr>
    	    	<tr>
    		<td>修改后的婚姻状况为（0为没有 1为有）：</td>
    		<td><input name="pm" type="text"/></td>
    	</tr>
    	    	<tr>
    		<td>要修改的id为：</td>
    		<td><input type="text" name="pid"/></td>
    	</tr>
    	    	<tr>
    		<td><input type="submit" value="提交"/></td>
    	</tr>
    </form>
  </body>
</html>
