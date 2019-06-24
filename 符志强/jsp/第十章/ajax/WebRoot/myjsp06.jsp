<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myjsp06.jsp' starting page</title>
    
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
		var ly;
		function checkUserExists(obj){
			
			//1.获取数据
			//获取登录名输入框的数据
			uname=document.getElementById("uname").value;
			ly=document.getElementById("ly").value;
			//alert(uname);
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
			
			//3.设置url        ------拨号  中文2次编码方式乱码
			ajaxObj.open("get","MyJspServlet06?uname="+encodeURI(encodeURI(uname)),true);
			//4.发送请求    -------打电话
			ajaxObj.send(null);
			//post 提交
	//		//3.设置url        ------拨号  中文2次编码方式乱码
	//		ajaxObj.open("post","CheckUserServlet",true);
	//		//3.1如果是post提交必须要设置请求头
	//		ajaxObj.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	//		//4.发送请求    -------打电话
	//		ajaxObj.send("uname="+uname);
			//5.设置回调函数   -----得到回答内容
			//5.1.根据响应的结果，更改注册的提示信息
	    	ajaxObj.onreadystatechange=processResult;//js事件：onblur="函数()"；
		}
			/*对结果进行处理的回调函数*/
	function processResult(){
			//	alert(ajaxObj.readyState);	alert(ajaxObj.status);
		//如果满足ajaxObj.readyState==4&&ajaxObj.status==200表示正确
		 if(ajaxObj.readyState==4&&ajaxObj.status==200){ 	
			 
			 //获取响应的内容---获取servlet通过out.print();发送的内容，类型文本
			 var flag = ajaxObj.responseText;
			 //alert(flag);
			 //1.将响应的结果输出到用户名的后面 span
			 var zz = document.getElementById("zz");
			  var lyb = document.getElementById("lyb");
			  if(flag== "false"){
				  
				   zz.innerHTML="作者："+uname;
					lyb.innerHTML="留言:"+ly;
			  }	  
		 }
	}
	</script>
  </head>
  <table align="center">
  		<tr>
  		<td colspan="2" >图灵留言板</td>
  		</tr>
  		<tr>
  		<td colspan="2" id="zz"></td>
  		</tr>
  		<tr>
  		<td colspan="2" id="lyb"></td>
  		</tr>
  		<tr>
  		<td>用户名：</td>
  		<td>
  			<input type="text" id="uname" />
  		</td>
  		</tr>
  		<tr>
  		<td>留言信息：</td>
  		<td>
  			<textarea rows="3" cols="25" id="ly" onblur="checkUserExists(this)"></textarea>
  		</td>
  		</tr>
  		<tr>
  		<td colspan="2" align="cneter">
  			<input type="submit"/>
  		</td>
  		</tr>
  </table>
  <body>
    <form action="">
    	
    </form>
  </body>
</html>
