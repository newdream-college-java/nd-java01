<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'index.jsp' starting page</title>
		<script type="text/javascript">
			var xmlhttp;
			function TS(obj){
				//alert(obj);
				createAjax();
				xmlhttp.open("post","TsSevl",true);
				xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
				xmlhttp.send("word="+obj);
				xmlhttp.onreadystatechange=kanban;
			}
			function kanban(){
				//alert(xmlhttp.readyState+"---"+xmlhttp.status);
				if(xmlhttp.readyState == 4 && xmlhttp.status==200){
				//	alert(1);
					var xmlObj=xmlhttp.responseXML;
					//alert(xmlObj);
					console.log(xmlObj);
					if(xmlObj!=null){
						var provinces=xmlObj.getElementsByTagName("province");
						var spen=document.getElementById("tsf");
						for(var i=0;i<provinces.length;i++){
							var name=provinces[i].childNodes[0].childNodes[0].nodeValue;
							alert(name);
						}
					}
				}
			}
			function createAjax() {
				if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
					xmlhttp = new XMLHttpRequest();
				} else {// code for IE6, IE5
					xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
				}
			}
		</script>

	</head>

	<body>
		<input type="text" onkeyup="TS(this.value)"/> <br/>
		<span id="tsf"></span>
	</body>
</html>
