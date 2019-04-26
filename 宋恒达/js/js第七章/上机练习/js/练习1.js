function verifyForm(){
	//用户名验证
	var userName=document.getElementById("user").value;
	var reg=/^([a-z A-Z]{1}[a-z A-Z 0-9]{3,15})$/;
	console.log(reg.test(userName));
	if(!reg.test(userName)){
		alert("用户名格式错误");
		return false;
	}
	//密码框验证
	var pwd=document.getElementById("pwd").value;
	reg=/^([a-z A-Z 0-9]{4,10})$/;
	console.log(reg.test(pwd));
	if(!reg.test(pwd)){
		alert("密码格式错误");
		return false;
	}
	var birth=document.getElementById("birth").value;
	reg=/^(19\d{2}|200\d)-(0?\d|1[1-2]{1})-(0?\d|[1-2]\d|3[0-1]{1})$/;
	console.log(!reg.test(birth));
	if(!reg.test(birth)){
		alert("生日格式错误");
		return false;
	}
	return true;
}