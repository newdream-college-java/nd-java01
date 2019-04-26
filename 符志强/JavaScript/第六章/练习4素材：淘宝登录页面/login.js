// JavaScript Document

function checkForm( )
{
	var strName = document.getElementById("txtName").value;
	var strPass = document.getElementById("txtPass").value;
    if(strName.length != 0)
	{	  	
	  for(var i=0;i<strName.length;i++)
	  {
	     var charTest=strName.toLowerCase( ).charAt(i);
		 if( (!(charTest>='0' && charTest<='9')) &&  (!(charTest>='a' && charTest<='z'))  && (charTest!='_') )
		 {
		  alert("会员名包含非法字符，只能包括 a-z、0-9 和下划线");
		  return false;
		  }
	  }
	}
	else
	{
		alert("请输入用户名");
		return false;
	}
	
	if(strPass== ""){
		alert("未输入密码 \n" + "请输入密码");
	    return false;
	    }
	else{
		if(strPass.length <6)
		{
		alert("密码位数不能少于6位，请重新输入！");
		return false
		}
	 }
	return true;
}
 function validateform() {
        var youxiang=document.getElementById("email").value;
        if (youxiang==""||youxiang.indexOf("@")==-1||youxiang.indexOf(".")==-1) {
          alert("格式错误");
          return false;
        }
        return true;
    }