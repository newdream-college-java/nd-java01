function toBookTicketServlet(obj,obj2,obj3,obj4,obj5){
//	alert(obj);
//	alert(obj2+obj3+obj4);
//	alert(obj5);
	if(obj==null){
		obj=0;
	}
	var page=document.getElementById("txtGoto").value;
	if(page==""){
		alert('跳转页数不能为空');
	}else if(page>obj){
		alert('最大页数为'+obj);
	}else{
		location.href="bookTicketServlet?page="+page+"&start-city="+obj2+"&end-city="+obj3+"&fromDate="+obj4+obj5;
	}
}
function toBookTicketServlet1(obj2,obj3,obj4){
//	alert(obj);
//	alert(obj2+obj3+obj4);
//	alert(obj5);
	location.href="bookTicketServlet?page=1&start-city="+obj2+"&end-city="+obj3+"&fromDate="+obj4;

}
function getMsg(obj){
	var error=document.getElementById('localSearchNoResult');
	if(obj!=null&&obj!=""){
		alert(obj);
		error.style.display='block';
		return;
	}
	error.style.display='none';
}