<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajax_01.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<style type="text/css">
	.fwright{
		text-align: right;
	}
	</style>
	
	<script type="text/javascript">
	  function checkUserExist(obj){
	  	//alert(1);
	  	uname=obj.value;
	  	createAjax();
	  	//2.2 设置url        ------拨号  中文2次编码方式乱码
		ajaxObj.open("get","checkUserServlet?uname="+encodeURI(encodeURI(uname)),true);
		//2.3 发送请求    -------打电话
		ajaxObj.send(null);
		//2.4 设置回调函数   -----得到回答内容
		//3.根据响应的结果，更改注册的提示信息
	    ajaxObj.onreadystatechange=processResult;
	  }
	  
	  function createAjax(){
		try{
			ajaxObj = new ActiveXObject("Msxml2.XMLHTTP");//IE 6以上
		} catch (e){
			try{
				ajaxObj= new ActiveXObject("Microsoft.XMLHTTP");//IE6以下
			}catch(e){
				try{
					ajaxObj = new XMLHttpRequest();//其他浏览器
					if(ajaxObj.overrideMimeType){
						ajaxObj.overrideMimeType("text/xml");
					}
				} catch (e) {
				}
			}
		}
	}
	/*对结果进行处理的回调函数*/
	function processResult(){
		 if(ajaxObj.readyState==4&&ajaxObj.status==200){
			 var flag=ajaxObj.responseText;
			 var errorInfo=document.getElementById("loginName");
			 var gaga=document.getElementById("jj");
			 if(flag=="false"){
			 	gaga.innerHTML=uname+"已经被注册";
			 }else{
			 	gaga.innerHTML=uname+"可以使用";
			 }
		 }
	}
	</script>
  </head>
  
  <body>
    <form>
    <table align="center">
    	<tr>
    		<td class="fwright">登录名：</td>
    		<td><input type="text" name="uname" value="xinmengxiang" id="loginName" onblur="checkUserExist(this)"/></td><del></del>
    		<td><span id="jj"></span></td>
    	</tr>
    	<tr>
    		<td class="fwright">密码：</td>
    		<td><input type="password" name="psw"/></td>
    	</tr>
    	<tr>
    		<td class="fwright"><input type="reset" value="重填"/></td>
    		<td><input type="submit" value="提交注册信息"/></td>
    	</tr>
    </table>
    </form>
  </body>
</html>
