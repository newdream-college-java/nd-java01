<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'question.jsp' starting page</title>



</head>
<%--  <%String box1=request.getParameter("box1");
  	out.print(box1) ;%>--%>
<body>
	你填写的内容是：
	<br> 昵称：${param.username}
	<br> 所在城市：${param.address}
	<br> 使用的开发语言：
	<c:forEach var="box" items="${paramValues.box}" varStatus="indexStat">
<c:out value="${box}"></c:out><br/>
	</c:forEach>
	
<%-- 
	<%
	
		List list= (List)request.getAttribute("box");
			for(List box: list){%>
			<%=box.get%>
			<% }
	
	%> --%>
	<br>
</body>
</html>
