$(function() {
	$("#form_submit").bind("click", function() {
		var remark = getValByID("remark");
		var question = getValByName("question");
		if (isEmpty(question)) {
			question = question.replace(/<\/?[^>]*>/g, ''); //去除HTML tag
			question = question.replace(/[ | ]*\n/g, '\n'); //去除行尾空白
			//str = str.replace(/\n[\s| | ]*\r/g,'\n'); //去除多余空行
			question = question.replace(/ /ig, '');//去掉 
			setValByName("question",question);
		}
		if (isEmpty(remark)) {
			remark = remark.replace(/<\/?[^>]*>/g, ''); //去除HTML tag
			remark = remark.replace(/[ | ]*\n/g, '\n'); //去除行尾空白
			//str = str.replace(/\n[\s| | ]*\r/g,'\n'); //去除多余空行
			remark = remark.replace(/ /ig, '');//去掉 
			setValByName("description",remark);
		}
	});

});

