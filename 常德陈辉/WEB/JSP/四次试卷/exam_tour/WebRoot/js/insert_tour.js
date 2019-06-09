function checking(obj){
	var city=document.getElementById("city").value;
	var place=document.getElementById("place").value;
	var time=document.getElementById("time").value;
	var note=document.getElementById("note").value;
	if(city==""){
		alert("请填写您去的国家/城市信息");
		return false;
	}
	if(place==""){
		alert("请填写您的区域/景点信息");
		return false;
	}
	if(time==""){
		alert("请填写您的旅游时间");
		return false;
	}
	if(note==""){
		alert("请填写您的经历记录");
		return false;
	}
	return true;
}