function emailFocus(obj){
	obj.className="register_input_Focus";
}
function emailBlur(obj){
	obj.className="register_input";
	var email_prompt=document.getElementById("email_prompt");
	var va=obj.value;
	var reg=/^\w+@\w+\.[a-zA-Z]{2,3}(\.[a-zA-Z]{2,3})?$/;
	con0=reg.test(va);
	if(con0==true){
		email_prompt.innerHTML="";
		email_prompt.className="register_prompt_ok";
	}else{
		email_prompt.innerHTML="邮箱格式错误，请输入正确格式";
		email_prompt.className="register_prompt_error";
	}
}
function nikeFocus(obj){
	obj.className="register_input_Focus";
}
function nikeBlur(obj){
	obj.className="register_input";
	var nickName_prompt=document.getElementById("nickName_prompt");
	var va=obj.value;
	var reg=/^[a-zA-Z0-9]{4,20}$/;
	con1=reg.test(va);
	if(con1==true){
		nickName_prompt.innerHTML="";
		nickName_prompt.className="register_prompt_ok";
	}else{
		nickName_prompt.innerHTML="昵称格式错误，请使用大小写英文字母、数字，长度4-20个字符";
		nickName_prompt.className="register_prompt_error";
	}
}
function passFocus(obj){
	obj.className="register_input_Focus";
}
function passBlur(obj){
	obj.className="register_input";
	var pwd_prompt=document.getElementById("pwd_prompt");
	va0=obj.value;
	var reg=/^(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[a-z].*).{6,20}$/;
	con2=reg.test(va0);
	if(con2==true){
		pwd_prompt.innerHTML="";
		pwd_prompt.className="register_prompt_ok";
	}else{
		pwd_prompt.innerHTML="密码格式错误，请使用大小写英文字母、数字，长度4-20个字符";
		pwd_prompt.className="register_prompt_error";
	}
}
function repFocus(obj){
	obj.className="register_input_Focus";
}
function repBlur(obj){
	obj.className="register_input";
	var repwd_prompt=document.getElementById("repwd_prompt");
	va1=obj.value;
	var reg=/^(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[a-z].*).{6,20}$/;
	con3=reg.test(va1);
	if(con3==true&&va0==va1){
		repwd_prompt.innerHTML="";
		repwd_prompt.className="register_prompt_ok";
	}else{
		repwd_prompt.innerHTML="密码不正确，请输入正确密码";
		repwd_prompt.className="register_prompt_error";
	}
}
function osub(){
	if(con0==true&&con1==true&&con2==true&&con3==true){
		return true;
	}else{
		return false;
	}
}
var cityList = new Array();

cityList['湖南省'] = ['长沙市','衡阳市'];
cityList['河南省'] = ['郑州市','洛阳市'];
cityList['湖北省'] = ['武汉市','宜昌市'];

window.onload=function(){
		var proSele = document.getElementById("province");
		//key---数组的下标    value---数组的值
		for(var key in cityList){
			proSele.add(new Option(key,key));
		}
			
}
function chageCities(){
	//alert("改变了省！！");
	//1.得到你选择的是哪个省
	var selepro = document.getElementById('province').value
	//alert(selepro);
	//2,加载这个省对应的所有市，到市的下拉列表中
	var cities = cityList[selepro];
	console.log(cities);
	//2.1获取城市的select
	var citySelObj = document.getElementById("city");
	//2.2清除原来所有option
	citySelObj.options.length=1;  //保留请选择这个option
	//2.3添加新的option
	for(var i=0;i<cities.length;i++){
		citySelObj.add(new Option(cities[i],cities[i]));
	}
}