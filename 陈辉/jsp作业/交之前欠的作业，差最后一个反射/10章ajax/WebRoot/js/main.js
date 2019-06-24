var ajaxObj;
function link(obj) {
	//1.获取省份
	//alert(1);
	var prod = obj.value;
	//
	alert(prod);
	//2.1得到ajax对象（XMLHttpRequest）-----手机
	createAjax();
	//2.2设置url------拨号 中文2此编码方式乱码
	ajaxObj.open("post", "QueryCitySvl", true);
	//2.3发送请求------打电话
	//如果是post提交必须要设置请求头
	ajaxObj.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded");
	ajaxObj.send("pid=" + prod);
	//ajaxObj.send(null);
	//2.4设置回调函数----得到回答内容 
	//3.根据响应的结果，更改注册的提示信息
	ajaxObj.onreadystatechange = callback; //js事件：onblur="函数（）"；

}
//1.获取用户名
//2.发送携带用户名的请求给服务器：
//3.根据响应的结果，更改注册的提示信息
/*对结果进行处理的回调函数*/
function callback() {
	if (ajaxObj.readyState == 4 && ajaxObj.status == 200) {
		//console.log(ajaxObj);
		//ajaxObj.responseText :获取文本信息
		//ajaxObj.responseXml:获取xml文档对象
		var xmlObj = ajaxObj.responseXML;
		console.log(xmlObj);
		//获取xml文档的city节点  console.log(xmlObj);
		var citys = xmlObj.getElementsByTagName("city");
		//console.log(citys);
		//获取city的select
		var citySelect = document.getElementById("city");
		citySelect.options.length = 1;
		for ( var i = 0; i < citys.length; i++) {
			var cid = citys[i].childNodes[0].childNodes[0].nodeValue;
			//console.log(cid);
			var cname = citys[i].childNodes[1].childNodes[0].nodeValue;
			//console.log(cname);
			//创建option对象
			var option = new Option(cname, cid);
			//console.log(option);
			//将option放入select
			citySelect.add(option);
		}
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