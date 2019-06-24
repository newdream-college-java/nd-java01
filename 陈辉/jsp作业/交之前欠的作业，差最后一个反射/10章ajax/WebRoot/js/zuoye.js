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
	//2.2����url------���� ����2�˱��뷽ʽ����
	ajaxObj.open("post", "SearchSuggest", true);
	//2.3��������------��绰
	//�����post�ύ����Ҫ��������ͷ
	ajaxObj.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded");
	ajaxObj.send("se=" + se);
	ajaxObj.onreadystatechange=processReuqest;
}

function calcPrice(num) {
	//������Ʒ�Ĺ��������
	document.getElementById("num_1").value = num;
	//�����Ʒ�Ĺ��򵥼�
	var unit = document.getElementById("unit_1").innerHTML;
	//������Ʒ�Ĺ�����
	document.getElementById("price_1").innerHTML = parseFloat(unit) * num;
}
function doAjax(num) {//����num���������������������obj
	//alert(1);
	if (num == "" || parseInt(num) < 1) {
		alert("����ȷ��д����������");
	} else {
		//2
		createAjax();

		//2.���ûص�����������������
		ajaxObj.onreadystatechange = function() {
			if (ajaxObj.readyState == 4) {
				if (ajaxObj.status == 200) {
					calcPrice(num);//���ù�����Ϣ
				}
			}
		};
		//3.����������Ϣ

		//3.1--����

		ajaxObj.open("post", "ChangeNumber", true);
		//3.2--��绰
		ajaxObj.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");
		var num = document.getElementById("num_1").value;
		ajaxObj.send("num=" + num);
	}

}

/*����ajax����*/
function createAjax() {
	try {
		ajaxObj = new ActiveXObject("Msxml2.XMLHTTP");//IE6����
	} catch (e) {
		try {
			ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");//IE6����
		} catch (e) {
			try {
				ajaxObj = new XMLHttpRequest();
				//���������
				if (ajaxObj.overrideMimeType) {
					ajaxObj.overrideMimeType("text/xml");
				}
			} catch (e) {
			}
		}
	}
}