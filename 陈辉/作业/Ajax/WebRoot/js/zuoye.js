var ajaxObj;

function processReuqest(){
	if(ajaxObj.readyState==4){
		if(ajaxObj.status==200){
			var sobj=document.getElementById("suggest");
			sobj.innerHTML="";
			var str=ajaxObj.responseText.split("-");
			console.log(str);
			var suggest="";
			if(str[0].length>0){
				for(i=0;i<str.length;i++){
					suggest+="<div onmouseover='javascript.suggestOver(this);'";
					suggest+="onmouseout='javascript.suggestOut(this);'";
					suggest+="onclick='javascript:setSearch(this.innerHTML);'";
					suggest+="class='suggest_link'>"+str[i]+"</div>";
				}
				sobj.innerHTML=suggest;
				document.getElementById("suggest").style.display="block";
			}else{
				document.getElementById("suggest").style.display="none";
			}
		}
	}
}

function searchSuggest(){
	//alert(1);
	var se=document.getElementById("search").value;
	//alert(se);
	createAjax();
	//2.2设置url------拨号 中文2此编码方式乱码
	ajaxObj.open("post", "SearchSuggest", true);
	//2.3发送请求------打电话
	//如果是post提交必须要设置请求头
	ajaxObj.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded");
	ajaxObj.send("se=" + se);
	ajaxObj.onreadystatechange=processReuqest;
}

function calcPrice(num) {
	//设置商品的购买的数量
	document.getElementById("num_1").value = num;
	//获得商品的购买单价
	var unit = document.getElementById("unit_1").innerHTML;
	//设置商品的购买金额
	document.getElementById("price_1").innerHTML = parseFloat(unit) * num;
}
function doAjax(num) {//传入num参数购买的数量，不再是obj
	//alert(1);
	if (num == "" || parseInt(num) < 1) {
		alert("请正确填写购买数量！");
	} else {
		//2
		createAjax();

		//2.设置回调函数（匿名函数）
		ajaxObj.onreadystatechange = function() {
			if (ajaxObj.readyState == 4) {
				if (ajaxObj.status == 200) {
					calcPrice(num);//重置购买信息
				}
			}
		};
		//3.设置请求信息

		//3.1--拨号

		ajaxObj.open("post", "ChangeNumber", true);
		//3.2--打电话
		ajaxObj.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");
		var num = document.getElementById("num_1").value;
		ajaxObj.send("num=" + num);
	}

}

/*创建ajax对象*/
function createAjax() {
	try {
		ajaxObj = new ActiveXObject("Msxml2.XMLHTTP");//IE6以上
	} catch (e) {
		try {
			ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");//IE6以下
		} catch (e) {
			try {
				ajaxObj = new XMLHttpRequest();
				//其他浏览器
				if (ajaxObj.overrideMimeType) {
					ajaxObj.overrideMimeType("text/xml");
				}
			} catch (e) {
			}
		}
	}
}