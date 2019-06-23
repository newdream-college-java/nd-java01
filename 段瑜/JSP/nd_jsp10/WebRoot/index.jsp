<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	var ajaxObj;
	var uname;
		function names(obj){
			uname=obj.value;
			createAjax();
			ajaxObj.open("get","indexServlet?uname="+encodeURI(encodeURI(uname)),true);
			ajaxObj.send(null);
			ajaxObj.onreadystatechange=processResult;
		}
		function processResult(){
			if(ajaxObj.readyState==4&&ajaxObj.status==200){
				var flag=ajaxObj.responseText;
				var errorInfo =document.getElementById("errorInfo");
				if(flag=="false"){
					errorInfo.innerHTML=uname+"已经被注册";
					errorInfo.style.color="red";
				}else{
					errorInfo.innerHTML=uname+"可以使用";
                  errorInfo.style.color="green";
				}
			}
		}
		function createAjax(){
			try {
				ajaxObj=new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
					try {
					ajaxObj = new XMLHttpRequest();//其他浏览器
					if (ajaxObj.overrideMimeType) {
						ajaxObj.overrideMimeType("text/xml");
					}
				} catch (e) {
				}
				}
			}
		}
	</script>
  </head>
  
  <body>
   <form action="" method="post">
		用户名：<input type="text" name="uname" onblur="names(this)"
			placeholder="请输入用户名" /> <span id="errorInfo"></span><br/>
	</form>
  </body>
</html>
