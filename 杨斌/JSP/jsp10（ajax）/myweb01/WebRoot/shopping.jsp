<%@ page language="java"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shopping.jsp' starting page</title>
    
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
		function  doAjax(num){
			if(num==""||parseInt(num)<1){
				alert("请填写商品数量，最少一件");
				
			}else{
				Ajax();
			
				ajaxObj.open("post","ChangeNumber", true);
				ajaxObj.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
				ajaxObj.send("num="+num);
				
				ajaxObj.onreadystatechange= function () {
					if(ajaxObj.readyState==4&&ajaxObj.status==200){
						calcPrice(num);
					}
			
					
				};
			};
		}
		function Ajax() {
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
		function calcPrice(num){
			document.getElementById("numr").value=num;
			var unit=document.getElementById("unit").innerHTML;
			document.getElementById("price").innerHTML=parseFloat(unit)*num;
		}
		
	
	</script>

  </head>
  
  <body onload="calcPrice(${empty sessionScope.num?1:sessionScope.num})">
    <form>
    	<table border="1">
	    	<tr>
	    		<td>商品编号</td>
	    		<td>商品名称</td>
	    		<td>商品单价</td>
	    		<td>购买数量</td>
	    		<td>累计金额</td>
	    	</tr>
	    	<tr>
	    		<td>1</td>
	    		<td>iPad_mimi</td>
	    		<td id="unit">1900</td>
	    		<td><input type="text" id="numr" style="width:50px" onblur="doAjax(this.value)"/></td>
	    		<td id="price">1900</td>
	    	</tr>
    	</table>
    </form>
  </body>
</html>
