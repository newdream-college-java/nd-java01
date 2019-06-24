<%@ page language="java" import="java.util.*,com.cc.entity.*"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

		<title>post.jsp</title>
<script type="text/javascript" src="js/main.js"></script>


	</head>
	<%
    //1.从数据库获取了所有的省份信息
   List<Province> list=   Arrays.asList(new Province[] { new Province(1,"湖南省"), new Province(2,"湖北省")});
    //2.将省份信息放入到 request域
    request.setAttribute("pp", list);
  %>
	<body>
		<form action="" method="post">
  		省份:<select name="pro" id="pro" onchange="link(this)">
  				<option value="0">--请选择省份--</option>
  		   	   <!-- pro.pid是province对象的属性名 -->
  		   	   <!-- items:表示需要被迭代的集合项:EL中的PP是servlet中request设置的key名
  		   	   		var表示给迭代的对象起个名字 
  		   	    -->
  		   	    <c:forEach items="${pp}" var="pro">
  		   	    	<option value="${pro.pid}">${pro.pname}</option>
  		   	    </c:forEach>
  		   </select>
  		   
  		城市:<select id="city" name="city">
  				<option value="0">--请选择城市--</option>
  		    </select>   
  	</form>
		<br>
	</body>
</html>
