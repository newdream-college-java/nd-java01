<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myjsp03.jsp' starting page</title>
    
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
		function doajax(obj){
			//alert(1);
			//1.获取文本框值
			uname=document.getElementById("uname").value;
			//2.创建ajax对象
			ajaxdx();
			//3.设置url
			ajaxObj.open("post","SearchSuggest",true);
			//3.1如果是post提交必须要设置请求头
			ajaxObj.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			//4.跳转
			ajaxObj.send("uname="+uname);
			//5.设置回调函数   -----得到回答内容
			//5.1.根据响应的结果，更改注册的提示信息
			ajaxObj.onreadystatechange=processResult;
		}
		function processResult(){
			// alert(ajaxObj.status);
			// alert(ajaxObj.readyState);
			//如果满足ajaxObj.readyState==4&&ajaxObj.status==200表示正确
		 if(ajaxObj.readyState==4&&ajaxObj.status==200){ 	
			 //alert(1);
			 //获取响应的内容---获取servlet通过out.print();发送的内容，类型文本
			 var flag = ajaxObj.responseText.split("-");
			 
			 //1.将响应的结果输出到用户名的后面 span
			 var iname = document.getElementById("id");
			 iname.innerHTML="";
			 var suggest="";
			if(flag[0].length>0){
				for(i=0;i<flag.length;i++){
					suggest+="<div onmouseover='javascript:suggestOver(this);'";
					suggest+=" onmouseout='javascript:suggestOut(this);'";
					suggest+=" onclick='javascript:setSearch(this.innerHTML);'";
					suggest+=" class='suggest_link'>"+flag[i]+"</div>";
				}
				iname.innerHTML=suggest;
				document.getElementById("id").style.display="block";
			}else{ 
				document.getElementById("id").style.display="none"; }
		 	}
		}
		function ajaxdx(){
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
  <form action="" method="post">
  	Ajax实现搜索提示<br>
    <input type="text" id="uname" onkeyup="doajax(this)" autocomplete="off"/><input type="submit" /><br>
    <div id="id"  style="width: 152px"></div>
    </form>
  </body>
</html>
