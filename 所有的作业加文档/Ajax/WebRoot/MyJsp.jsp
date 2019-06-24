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
    
    <title>MyJsp.jsp</title>
    
	

  </head>
  
  <body>
    省份：
			<select name="pro" id="pro" >
				<option value="0">
					--请选择省份--
				</option>
				<!-- pro.pid是province对象的属性名 -->
				<!-- items:表示需要被迭代的集合项:EL中的PP是servlet中request设置的key名
  		   	   		var表示给迭代的对象起个名字 
  		   	    -->
				<c:forEach items="${pp}" var="pro">
					<option value="${pro.pid }">
						${pro.pname }
					</option>
				</c:forEach>
			</select> <br>
  </body>
</html>
