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
		  alert("��Ա�������Ƿ��ַ���ֻ�ܰ��� a-z��0-9 ���»���");
		  return false;
		  }
	  }
	}
	else
	{
		alert("�������û���");
		return false;
	}
	
	if(strPass== ""){
		alert("δ�������� \n" + "����������");
	    return false;
	    }
	else{
		if(strPass.length <6)
		{
		alert("����λ����������6λ�����������룡");
		return false
		}
	 }
	return true;
}
 function validateform() {
        var youxiang=document.getElementById("email").value;
        if (youxiang==""||youxiang.indexOf("@")==-1||youxiang.indexOf(".")==-1) {
          alert("��ʽ����");
          return false;
        }
        return true;
    }