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

		<title>My JSP 'regi.jsp' starting page</title>
		<script type="text/javascript" src="js/regi.js"></script>
	<script type="text/javascript">
		var ajaxObj;
		var name;
		function denru(obj){
			name=obj.value;
			if(name==""){
				alert("不能为空！")
			}else{
				/*获取ajax对象*/
				createAjax();
				/*设置url*/
				ajaxObj.open("get","RegiSerl?uname="+encodeURI(encodeURI(name)),true);
				/*发送请求 */
				ajaxObj.send(null);
				/*设置回调函数*/
				ajaxObj.onreadystatechange=textResult;
			}
		}
		//回调函数
		function textResult(){
			//alert(ajaxObj.readyState+"----"+ajaxObj.status);
			if(ajaxObj.readyState==4&&ajaxObj.status==200){
				var span=document.getElementById("span");
				var flag=ajaxObj.responseText;
				if(flag=="false"){
					span.innerHTML=name+"已经被注册";
					span.style.color="red";
				}else{
					span.innerHTML=name+"可以使用";
					span.style.color="green";
				} 
			}
		}
		/*创建ajax对象*/
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
	</head>

	<body>
		<table align="center">
			<tr>
				<td>登入名：</td>
				<td>
					<input type="text" id="uname" onblur="denru(this)"/>
					<span id="span"></span>
				</td>
			</tr>
			<tr>
				<td>密码：</td>
				<td>
					<input type="password" id="upass"/>
				</td>
			</tr>
			<tr>
				<td>再次输入密码：</td>
				<td>
					<input type="password" id="upwd"/>
				</td>
			</tr>
			<tr>
				<td>电子邮箱：</td>
				<td>
					<input type="text" id="uemail"/>
				</td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
					<input type="text" id="usex"/>
				</td>
			</tr>
			<tr>
				<td>地址：</td>
				<td>
				</td>
			</tr>
			<tr>
				<td>出生日期：</td>
				<td>
					省：
					<select>
						<option>--请选择省份--</option>
						<option></option>
					</select>
					市：
					<select>
						<option>--请选择市--</option>
						<option></option>
					</select>
					县：
					<select>
						<option>--请选择县--</option>
						<option></option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<input type="reset" value="重&nbsp;填"/>
				</td>
				<td>
					<input type="submit" value="同意以下服务条款，提交注册信息"/>
				</td>
			</tr>
		</table>
	</body>
</html>
