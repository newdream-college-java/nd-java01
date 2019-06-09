<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>手机详情</title>
    <link type="text/css" href="css/date_hand.css" rel="stylesheet"/>
  </head>
  <body>
    <table align="center" width="60%"  >
    	<tr>
    		<th colspan="2" class="hand">${hand.namet }</th>
    	</tr>
    	<tr>
    		<th>参考价格:</th>
    		<td>${hand.price }</td>
    	</tr>
    	<tr>
    		<th>网络模式:</th>
    		<td>${hand.networkm }</td>
    	</tr>
    	<tr>
    		<th>网络类型:</th>
    		<td>${hand.networkt }</td>
    	</tr>
    	<tr>
    		<th>外观设计:</th>
    		<td>${hand.facade }</td>
    	</tr>
    	<tr>
    		<th>主频尺寸:</th>
    		<td>${hand.screens }</td>
    	</tr>
    	<tr>
    		<th>触&nbsp;摸&nbsp;屏:</th>
    		<td>${hand.feels }</td>
    	</tr>
    	<tr>
    		<td align="right" colspan="2">
    			<a href="QueryHandSetServlet" >返回</a>
    		</td>
    	</tr>
    </table>
  </body>
</html>
