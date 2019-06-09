function chaXun(){
	var keMuId=$("keMu").value;
	if(keMuId>0){
		location.href="QuestionServlet?keMuId="+keMuId;
	}else{
		alert("您的查询有误！！！");
	}
}

function $(id){
	var tagObj=document.getElementById(id);
	return tagObj;
}