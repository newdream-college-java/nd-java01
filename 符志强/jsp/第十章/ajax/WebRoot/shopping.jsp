<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP ' shopping.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
var ajaxobj;
var sl;
	function doAjax(obj){
		//alert(1);
		//1.获取

		//获取数量
		sl=document.getElementById("sl").value;
		//alert(sl);
		//2.创建ajax对象
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
		//这是发送方式和地址  以及异步请求
		ajaxObj.open("get","ChangeNumber?sl="+sl,true);
		//跳转
		ajaxObj.send(null);
					//5.设置回调函数   -----得到回答内容
			//5.1.根据响应的结果，更改注册的提示信息
	    	ajaxObj.onreadystatechange=processResult;//js事件：onblur="函数()"；
		}
			/*对结果进行处理的回调函数*/
	function processResult(){
			//如果满足ajaxObj.readyState==4&&ajaxObj.status==200表示正确
		 if(ajaxObj.readyState==4&&ajaxObj.status==200){
		//获取单价
		var dj=document.getElementById("dj").innerHTML;
		//alert(dj);
			 //1.将响应的结果输出到用户名的后面 span
			 var je = document.getElementById("je");
			 
				  je.innerHTML=sl*dj;
		 }
	}
</script>
  </head>
  
  <body>
    <form action="">
    	<table align="center" border="2">
    		<tr>
    			<td>商品编号</td>
    			<td>商品名称</td>
    			<td>商品单价</td>
    			<td>购买数量</td>
    			<td>累计金额</td>
    		</tr>
    		<tr>
    			<td>1</td>
    			<td>iPad_mini</td>
    			<td id="dj">1900</td>
    			<td>
    				<input type="text" id="sl" onblur="doAjax(this.value)" />
    			</td>
    			<td id="je"></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
