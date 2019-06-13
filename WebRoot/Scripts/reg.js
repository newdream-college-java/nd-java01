//>>>>>>>>>>>>>注册查询js
var ajaxObj;
var username;
var repwd;
var pwd;
var yanzheng;
function check(obj){
	//1.获取值
	username = obj.value;
	//alert(username);
	//2.发送携带用户名的请求给服务器
	//2.1得到ajax对象
	createAjax();
	//2.2设置url-----拨号
	ajaxObj.open("get","SpUserSelectNameSvl?username="+encodeURI(encodeURI(username)),true);
	//2.3发送请求---打电话；
	ajaxObj.send(null);
	//2.4设置回调函数---得到回调信息；
	ajaxObj.onreadystatechange=processResult;
	//3.根据响应的结果，更改注册的提示信息
	//return false;
}
//对结果进行回调处理
function processResult(){
	//alert(2);
	if(ajaxObj.readyState==4&&ajaxObj.status==200){
		//获取响应的内容--获取servlet通过out.print();发送的内容，类型文本
		var flag=ajaxObj.responseText;
		//1..将响应的结果输出到用户名的后面span
		var errorInfo=document.getElementById("errorinfo");
		if (flag == "false") {
			errorInfo.innerHTML = username + "已经被注册";
			errorInfo.style.color = "red";
		} else {
			errorInfo.innerHTML = username + "可以使用";
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
				//其他浏览器
				if (ajaxObj.overrideMimeType) {
					ajaxObj.overrideMimeType("text/xml");
				}
			} catch (e) {
			}
		}
	}
}
function checkpwd(obj){
	 pwd=obj.value;
	//alert(pwd);
}
function checkrepwd(obj){
	  repwd=obj.value;
	  if(pwd==repwd){
		  //alert("密码必须一致")
	  }else{
		   alert("密码必须一致");
		   return false;
	  }
}
function checkyanzheng(obj){
	yanzheng=obj.value;
	//alert(yanzheng);
	if(obj.value==""){
		 alert("验证码不能为空");
		//alert(yanzheng);
	}else{
		alert("验证码不能为空");
		return false;
	}
}
//定义一个$方法
function $(id){
	var tagObj=document.getElementById(id);
	return tagObj;
}
function checkContent(obj){
	//alert(1);
	var usernameid=$("username").value;
	//alert(usernameid);
	var pwdid=$("pwd").value;
	var repwdid=$("repwd").value;
	var reusernameid=$("reusername").value;
	var tableid=$("table").value;
	var zipid=$("zip").value;
	var numberid=$("number").value;
	var addressid=$("address").value;
	var yanzhengid=$("yanzheng").value;
	var boxid=$("box").checked;
	//alert(boxid);
	
	if(usernameid==""){
		alert("用户名不能为空！");
		return false;
	}
	if(pwdid==""){
		alert("密码不能为空！");
		return false;
	}
	if(repwdid==""){
		alert("请填写确认密码！")
		return false;
	}
	if(reusernameid==""){
		alert("真实姓名不能为空！");
		return false;
	}
	
	if(tableid==""){
		alert("电话号码不能为空！");
		return false;
	}
	if(zipid==""){
		alert("邮编不能为空！");
		return false;
	}
	if(numberid==""){
		alert("身份证不能为空！");
		return false;
	}
	if(addressid==""){
		alert("地址不能为空！");
		return false;
	}
	if(yanzhengid==""){
		alert("验证码不能为空！");
		return false;
	}
	if(boxid==false){
		alert("请勾选复选框！");
		return false;
	}
	return true;
}
//>>>>>>>>>>>>>注册查询js