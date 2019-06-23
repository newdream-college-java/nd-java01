<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		var numbre;
		var ajaxObj;
		
		function monyes(obj){
			number=obj.value;	
			var money=document.getElementById("num_1").innerHTML;		
			if(number<=0){
				errorInfo.innerHTML="不可以为零";				
			}else{
				document.getElementById("money").innerHTML=money*number;
			}
			
		}
	</script>
  </head>
  
  <body>
  <form action="">
    <table border="1">
    	<tr>
    		<td>商品编号</td>
    		<td>商品名称</td>
    		<td>商品单价</td>
    		<td>购买数量</td>
    		<td>积累金额</td>
    	</tr>
    	<tr>
    		<td>1</td>
    		<td>iPad4_mini</td>
    		<td id="num_1">1900</td>
    		<td><input type="text" name="number" id="number" onblur="monyes(this)" value="1" /></td>
    		<td id="money">1900</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
