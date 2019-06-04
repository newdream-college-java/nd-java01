<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'NO2.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table align="center" border=1 >
  <th colspan="2" >会员信息</th>
  
  <tr>
  <td>姓名</td>
  <td><input type="text"/></td>
  </tr>
  
  <tr>
  <td>性别</td>
  <td>
  <input type="radio" name="sex" checked="checked"/>男&nbsp;
  <input type="radio" name="sex" />女
  </td>
  </tr>
  
  <tr>
  <td>年龄</td>
  <td><input type="text"/></td>
  </tr>
  
  <tr>
  <td>家庭住址</td>
  <td><input type="text"/></td>
  </tr>
  
  <tr>
  <td>Email</td>
  <td><input type="text"/></td>
  </tr>
  
  <tr>
  <td colspan="2" align="center"><input type="submit" value="修改"/>
  <input type="reset" value="重置"/></td>
  </tr>
  </table>
  
  </body>
</html>
