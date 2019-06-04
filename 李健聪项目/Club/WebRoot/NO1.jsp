<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<%---<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'NO1.jsp' starting page</title>
	<link rel="stylesheet" type="text/css" href="styles.css">
	

  </head>
  
  <body>
  <table align="center" width=60% border="1">
  <th colspan="10" style=background-color:gray>俱乐部会员信息</th>
  <tr>
  <td style=font-weight:800 >编&nbsp;&nbsp;&nbsp;号</td>
  <td style=font-weight:bold>姓&nbsp;&nbsp;&nbsp;名</td>
  <td style=font-weight:bold>性&nbsp;&nbsp;&nbsp;别</td>
  <td style=font-weight:bold>年&nbsp;&nbsp;&nbsp;龄</td>
  <td colspan="4" style=font-weight:bold>家&nbsp;庭&nbsp;住&nbsp;址&nbsp;</td>
  <td colspan="2" style=font-weight:bold>&nbsp;&nbsp;Email&nbsp;&nbsp;</td>
  </tr>
  <c:forEach var="cb" items="${list}">
  	<tr>
  	<td>${cb.id}</td>
  	<td>${cb.name}</td>
  	<td>${cb.sex}</td>
  	<td>${cb.age}</td>
  	<td colspan="4">${cb.address}</td>
  	<td colspan="2">${cb.email}</td>
  	</tr>
  </c:forEach>
  </table>
  
  </body>
</html>
