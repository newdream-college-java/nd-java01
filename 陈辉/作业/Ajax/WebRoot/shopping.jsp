<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shopping.jsp' starting page</title>
    
	<script type="text/javascript" src="js/zuoye.js"></script>

  </head>
  
  <body>
    <table border="1">
    	<tr>
    		<td>商品编号</td>
    		<td>商品名称</td>
    		<td>商品单价</td>
    		<td>购买数量</td>
    		<td>累计金额</td>
    	</tr>
    	<tr>
    		<td>1</td>
    		<td>iPad_mini</td>
    		<td id="unit_1">1900</td>
    		<td><input type="text" id="num_1" onblur="doAjax(this.value)"></td>
    		<td id="price_1">1900</td>
    	</tr>
    </table> <br>
  </body>
</html>
