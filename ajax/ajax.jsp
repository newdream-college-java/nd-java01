<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript">
  var ajaxObj;
  var name;
  function a(obj){
  	name=obj.value;
  	//alert(name);
  	
  	createAjax();
  	//首先open一下
  	ajaxObj.open("get","AjaxServlet?name="+encodeURI(encodeURI(name)),true);
  	ajaxObj.send(null);
  	
  	ajaxObj.onreadystatechange=pro;//指定回调函数  
  }
  	function  pro(){
  		if(ajaxObj.status==200&&ajaxObj.readyState==4){
  		var flag=ajaxObj.responseText;//这个是用来接收servlet中的outprint的
		var ajax=document.getElementById("ajax");
		if(flag=="false"){
			ajax.innerHTML=name+"已被注册，不能使用";
			ajax.style.color="red";
		}else{
			ajax.innerHTML=name+"可以使用";
			ajax.style.color="green";
		}		
  		}
  	}
  	
  	
  function createAjax() {
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
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajax.jsp' starting page</title>
    
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
  
  <!-- 第一步先触发时间 -->
    用户名:<input type="text" id="name" name="name" onblur="a(this)" />
	<span id="ajax"></span>
  </body>
</html>
