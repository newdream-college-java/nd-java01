<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  <script>
  var ajaxObj;
  var name;
  function checkUserExists(obj){
  	name=obj.value;
  	var te=document.getElementById("text");
  	if(name==""){
  		te.innerHTML="用户名不能为空";
  		te.style.color="red";
  	}else{
  		te.innerHTML="";
  		createAjax();
  	}
  	
  	
  	
  	ajaxObj.open("get","CheckUserServlet?name="+encodeURI(encodeURI(name)),true);
  	ajaxObj.send(null);
  	
  	ajaxObj.onreadystatechange=processRequest;
  
  }
  /*function  pro(){
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
  	}*/
  	function processRequest(){
  		if(ajaxObj.readyState==4&&ajaxObj.status==200){
  			var text=document.getElementById("text");
  			var flag=ajaxObj.responseText;
  			alert(flag);
  			if(flag=="true"){
  				text.innerHTML=name+"该用户名不可以使用";
    			text.style.color="red";
  			}else{
  				text.innerHTML=name+"该用户名可以使用";
  	  			text.style.color="green";
  			}
  			//alert(2);
  		}
}  
  function createAjax(){
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
    <title>My JSP 'index.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    	登录名：<input id="loginName" onblur="checkUserExists(this)" />
    	<span  id="text"></span>
  </body>
</html>
