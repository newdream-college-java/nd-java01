<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>leap.jsp</title>


</head>

<body>
	<c:set var="year" value="2016"></c:set>
	<c:if test="${year%4==0&&year%100!=0||year%400==0 }">
		<c:out value="${year}是闰年"></c:out>
	</c:if>
	<%
		int year=2016;
	    if(year%4==0&&year%100!=0||year%400==0){
	    
	    }
	%>

	<br>
</body>
</html>
