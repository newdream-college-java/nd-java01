 <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>index.jsp</title>
		<script type="text/javascript">
var ajaxObj;
var uname;
function checkUname(obj) {
	//1.获取用户名
	uname = obj.value;
	//alert(uname);
	//2.发送携带用户名的请求给服务器：
	//location.href="index.jsp";//同步请求 刷新整个网页
	//ajax: 发送异步请求 局部刷新网页
	//2.1得到ajax对象（XMLHttpRequest）-----手机
	createAjax();
	//2.2设置url------拨号 中文2此编码方式乱码
	ajaxObj.open( deURI(encodeURI(uname)),true);
	//2.3发送请求------打电话
	ajaxObj.send(null);
	//2.4设置回调函数----得到回答内容 
	//3.根据响应的结果，更改注册的提示信息
	ajaxObj.onreadystatechange = processResult; //js事件：onblur="函数（）"；

}
//1.获取用户名
//2.发送携带用户名的请求给服务器：
//3.根据响应的结果，更改注册的提示信息
/*对结果进行处理的回调函数*/
function processResult() {
	//alert(1);
	//alert(ajaxObj.readyState+" =="+ajaxObj.status);
	if (ajaxObj.readyState == 4 && ajaxObj.status == 200) {
		//获取响应的内容--获取servlet通过out.print();发送的内容，类型文本
		var flag = ajaxObj.responseText;
		//1.将响应的结果输出到用户名的后面span
		var errorInfo = document.getElementById("errorinfo");
		if (flag == "false") {
			errorInfo.innerHTML = uname + "已经被注册";
			errorInfo.style.color = "red";
		} else {
			errorInfo.innerHTML = uname + "可以使用";
			errorInfo.style.color = "green";
		}
	}
}
/*创建ajax对象*/
function createAjax() {
	try {
		ajaxObj = new ActiveXObject("Msxml2.XMLHTTP");//IE6以上
	} catch (e) {
		try {
			ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");//IE6以下
		} catch (e) {
			try {
				ajaxObj = new XMLHttpRequest();
				其他浏览器
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
			用户名：
			<input type="text" name="uname" onblur="checkUname(this)"
				placeholder="请输入用户名" />
			<span id="errorinfo"></span>
			<br />
			密码：
			<input type="password" name="pwd" />
			<br />
			确认密码：
			<input type="password" name="re-pwd" />
			<input type="submit" value="注册" />
			<br />
		</form>
		<br>
	</body>
</html>
