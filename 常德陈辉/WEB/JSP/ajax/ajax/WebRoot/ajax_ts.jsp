<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'ajax_ts.jsp' starting page</title>
		<script type="text/javascript">
		var xmlhttp;
function uname(obj) {
	//alert(obj); 
	if(obj==""||obj==0){
		alert("不能为空");
	}else{
		var jg=document.getElementById("jg");
		var a=obj*1900;
		jg.innerHTML=a;
	}
}
function createAjax() {
	var xmlhttp;
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
}
</script>
	</head>

	<body>
		<table align="center">
			<tr>
				<td>
					购买数量
				</td>
				<td>
					累计金额
				</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="usum" value="1" onblur="uname(this.value)" />
				</td>
				<td id="jg">
					1900
				</td>
			</tr>
		</table>
	</body>
</html>
