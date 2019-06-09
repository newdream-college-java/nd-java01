function tiJiao(obj){
	var question=document.getElementById("question").value;
	var questiona=document.getElementById("questiona").value;
	var questionb=document.getElementById("questionb").value;
	var questionc=document.getElementById("questionc").value;
	var questiond=document.getElementById("questiond").value;
	var answer=document.getElementById("answer").value;
	if(question==""){
		alert("题干不能为空！");
		return false;
	}
	if(questiona==""){
		alert("A选项不能为空！");
		return false;
	}
	if(questionb==""){
		alert("B选项不能为空！");
		return false;
	}
	if(questionc==""){
		alert("C选项不能为空！");
		return false;
	}
	if(questiond==""){
		alert("D选项不能为空！");
		return false;
	}
	if(answer==""){
		alert("答案不能为空！");
		return false;
	}
	
	return true;
}
