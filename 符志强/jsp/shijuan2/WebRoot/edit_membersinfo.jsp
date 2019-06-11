<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'edit_membersinfo.jsp' starting page</title>
    
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
    <form action="EditMemServlet" method="post">
    	<table align="center" border="1" width="400" >
    		<tr>
    			<td colspan="2" align="center">会员信息</td>
    		</tr>
    		<c:forEach var="cx" items="${list}">
    		<input type="hidden" name="id" value="${cx.id}" />
    		<tr>
    			<td align="center" >姓名</td>
    			<td><input type="text" name="uname" value="${cx.uname}" /></td>
    		</tr>
    		<tr>
    			<td align="center">性别</td>
    			<td><input type="radio" name="usex" value="男" ${cx.usex =="男"?"checked=true":""}/>男
    				<input type="radio" name="usex" value="女" ${cx.usex =="女"?"checked=true":""}/>女
    			</td>
    		</tr>
    		<tr>
    			<td align="center">年龄</td>
    			<td><input type="text" name="uage" value="${cx.uage }"/></td>
    		</tr>

    		<tr>
    			<td align="center">家庭住址</td>
    			<td><input type="text" name="udizhi" value="${cx.udizhi }" /></td>
    		</tr>
    		<tr>
    			<td align="center">Email</td>
    			<td><input type="text" name="uemail" value="${cx.uemail }" /></td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center">
    				<input type="submit" value="修改" />
					<input type="reset" value="重置"/>
    			</td>
    			
    		</tr>
    		 	</c:forEach>
    	</table>
    </form>
  </body>
</html>
