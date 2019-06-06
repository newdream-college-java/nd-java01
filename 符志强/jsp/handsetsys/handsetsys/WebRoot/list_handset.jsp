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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript">
		function delect(){
			var a = confirm("是否删除");
			if(a == true){
			alert("删除成功");
			return true;
		}else{
			alert("取消删除");
			return false;
		}
	}
	</script>
  </head>
  
  <body>
  	<form action="">
  		<table align="center" border="1" width="400">
  			<tr>
  				<td colspan="3" align="center">手机信息</td>
  			</tr>
  			<tr>
  				<td>品牌型号</td>
  				<td>参考报价</td>
  				<td>操作</td>
  			</tr>
  			<c:forEach var="xh" items="${lists}">
  			<tr>
  				<td>${xh.name_type}</td>
  				<td>${xh.price}</td>
  				<td>
  					<a href="ParticularsServlet?id=${xh.hs_id}">详情</a>
  					<a href="DeleteHandSetServlet?id=${xh.hs_id}" onclick=" return delect()">删除</a>
  				</td>
  			</tr>
  			</c:forEach>
  		</table>
  	</form>
  </body>
</html>
