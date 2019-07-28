<%@ page language="java"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
	 var loginError;
		function checkUserExists(obj) {
			loginError=document.getElementById("loginError");
			if(obj.value==""){
				loginError.innerHTML="用户名不能为空";
				return false;
			}else{
				loginError.innerHTML="";
			}
			var uname=obj.value;
			doAjax();
			ajaxObj.open("get", "CheckUserServlet?uname="+encodeURI(encodeURI(uname)), true);
			ajaxObj.send(null);
			ajaxObj.onreadystatechange=porcessResult;
			
		}
		function porcessResult() {
			if(ajaxObj.readyState==4&&ajaxObj.status==200){
				if(ajaxObj.responseText=="false"){
					loginError.innerHTML="用户名已经被注册";
				}else if(ajaxObj.responseText=="true"){
					loginError.innerHTML="用户名可以使用";
				}
				
			}
			
		}
		function doAjax() {
			try {
				ajaxObj = new ActiveXObject("Msxml2.XMLHTTP");//IE 6以上
			} catch (e) {
				try {
					ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");//IE6以下
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
    用户名<input type="text" name="uname" onblur="checkUserExists(this)"/><span id="loginError"></span>
    
     <br>
  </body>
</html>
