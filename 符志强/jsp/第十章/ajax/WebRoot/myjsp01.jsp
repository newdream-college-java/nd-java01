<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
		function checkUserExists(obj){
			
			//1.获取数据
			//获取登录名输入框的数据
			uname=document.getElementById("uname").value;
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
			ajaxObj.open("get","CheckUserServlet?uname="+encodeURI(encodeURI(uname)),true);
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
		//如果满足ajaxObj.readyState==4&&ajaxObj.status==200表示正确
		 if(ajaxObj.readyState==4&&ajaxObj.status==200){ 	
			 
			 //获取响应的内容---获取servlet通过out.print();发送的内容，类型文本
			 var flag = ajaxObj.responseText;
			 
			 //1.将响应的结果输出到用户名的后面 span
			 var iname = document.getElementById("iname");
			  if(flag== "false"){
				  iname.innerHTML=uname+"已经被注册";
				  //改颜色
				  iname.style.color="red";
			  }	 else{
				  iname.innerHTML=uname+"可以使用";
				   //改颜色
                  iname.style.color="green";
			  }
		 }
	}
	</script>
  </head>
  
  <body>
   <form action="" method="post">
   	<table>
   		<tr>
   			<td>登录名：</td>
   			<td>
   				<input type="text" id="uname" onblur="checkUserExists(this)" />
   				<span id="iname" ></span>
   			</td>
   		</tr>
   		<tr>
   			<td>密码：</td>
   			<td>	<input type="password" name="password" /></td>
   		</tr>
   		<tr>
   			<td>再次输入密码：</td>
   			<td><input type="password" name="pwd" /></td>
   		</tr>
   		<tr>
   			<td>电子邮箱：</td>
   			<td><input type="text" name="uname" /></td>
   		</tr>
   		<tr>
   			<td>性别：</td>
   			<td>
   				<input type="radio" name="sex" value="男" />男
   				<input type="radio" name="sex" value="女" />女
   			</td>
   		</tr>
   		<tr>
   			<td>爱好：</td>
   			<td>
   				<input type="checkbox" name="ah" value="运动" />运动
   				<input type="checkbox" name="ah" value="聊天" />聊天
   				<input type="checkbox" name="ah" value="玩游戏" />玩游戏
   			</td>
   		</tr>
   		<tr>
   			<td>出生日期：</td>
   			<td>
   				<input type="text" />年
   				<select>
   					<option>1</option>
   					<option>2</option>
   					<option>3</option>
   					<option>4</option>
   					<option>5</option>
   					<option>6</option>
   					<option>7</option>
   					<option>8</option>
   					<option>9</option>
   					<option>10</option>
   					<option>11</option>
   					<option>12</option>
   				</select>月
   				<input type="text" />日
   			</td>
   		</tr>
   		<tr>
   			<td>
				<input type="reset" />
			</td>
   			<td>
   				<input type="submit" />
   			</td>
   		</tr>
   	</table>
   </form>
  </body>
</html>
