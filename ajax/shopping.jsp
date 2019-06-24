<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <script type="text/javascript">
   var ajaxObj;
   	function a(obj){
   		var number=obj.value;
   		//alert(number);
   		if(number==""||parseInt(number)<0){
   			document.getElementById("num_1").innerHTML="";	
   			alert("数量不能为空且数量不能小于1,请重新输入");
   		}else{
   			createajax();
   			ajaxObj.open("get","ChangeNumber?number="+number,true);
   			ajaxObj.send(null);
   			ajaxObj.onreadystatechange=pro;
   		}
   			
   		
   	}
   	
   		function pro(){
   				if(ajaxObj.status==200&&ajaxObj.readyState==4){
/*   					var show=document.getElementById("show").innerHTML;
   					var danjia=document.getElementById("danjia").innerHTML;
   					var num=document.getElementById("unit_1").value;
   					show=danjia*num;
*/   
					var aja=ajaxObj.responseText;
					if(aja=="false"){
						document.getElementById("num_1").innerHTML="";	
						document.getElementById("show").innerHTML="请按要求来";
						document.getElementById("show").style.color="red";
						
					}else{
						//var num_1=document.getElementById("num_1").innerHTML;
						var shuliang=document.getElementById("unit_1").value;
						var danjia=document.getElementById("danjia").innerHTML;
						var num_1=danjia*shuliang;
						document.getElementById("num_1").innerHTML=num_1;
						document.getElementById("show").innerHTML="可以使用";
						document.getElementById("show").style.color="green";
						
						
					}
				}
   		}
   		
   	function createajax(){
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
    <title>shopping</title>
  </head>
  
  <body>
	<form action="" method="get" >
		<table align="center" border="1">
			<tr>
				<td>
					商品编号
				</td>
				<td>
					商品名称
				</td>
				<td>
					商品单价
				</td>
				<td>
					购买数量
				</td>
				<td>
					累计金额
				</td>
			</tr>
				<td>1</td>
				<td>iPad_mini</td>
				<td id="danjia">1900</td>
				<td>
					<input type="text" id="unit_1"  onblur="a(this)" />
				</td>
				<td id="num_1">1900</td>
			<tr>
				<span id="show"></span>
			</tr>
		</table>
	</form>
  </body>
</html>
