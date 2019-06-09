function vip(obj){
	var name=document.getElementById("name").value;
	var age=document.getElementById("age").value;
	var address=document.getElementById("address").value;
	var email=document.getElementById("email").value;
	if(name==""){
		alert("名字不能为空！");
		return false;
	}
	if(age==""){
		alert("年龄不能为空！");
		return false;
	}
	if(address==""){
		alert("地址不能为空！");
		return false;
	}
	if(email==""){
		alert("邮件不能为空！");
		return false;
	}
	return true;
}