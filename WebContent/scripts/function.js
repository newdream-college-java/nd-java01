// JavaScript Document
//#################下单#####################
function addOrderSvl(pid){
	//alert(pid);
	location.href="addOrderSvl?pid="+pid;
}


//#################下单#####################

function createXMLHttpRequest(){
	var xmlhttp;
	try{
		xmlhttp=new XMLHttpRequest();
		if(xmlhttp.overrideMimeType){
			xmlhttp.overrideMimeType("text/xml");
		}
	}catch(e1){
		try{
			xmlhttp = new ActiveXObject("Msxml2.XMLTTP");
		}catch(e2){
			try{
				xmlhttp = new ActiveXObject("Microsoft.XMLTTP");
			}catch(e3){
				xmlhttp = null;
			}
		}
	}
	return xmlhttp;
}

//��д�ַ�����trim()����
String.prototype.trim = function() {
	  var m = this.match(/^\s*(\S+(\s+\S+)*)\s*$/);
	  return (m == null) ? "" : m[1];
}	

function doAjax(obj,url){
	var ajaxRequest = createXMLHttpRequest();
	var spanObj = null;
	
	if(obj!=null){
		spanObj = obj.parentNode.getElementsByTagName("span")[0];
		if(!CheckItem(obj)){
			return;	
		}
	}
	if(ajaxRequest!=null){
		ajaxRequest.open("get",url,true);
		ajaxRequest.send(null);
		ajaxRequest.onreadystatechange = function (){
			if(ajaxRequest.readyState==4 && ajaxRequest.status==200){
				if(obj!=null){
					spanObj.className = "error";
					spanObj.innerHTML = ajaxRequest.responseText.trim();
					if(ajaxRequest.responseText.trim()=="���û����Ѿ�ע��"){
						obj.onfocus = null;	//���û�ȡ�����¼�
						obj.select();
					}
				}	
			}
		}
	}
}

function FocusItem(obj)
{
	obj.parentNode.parentNode.className = "current";
	var msgBox = obj.parentNode.getElementsByTagName("span")[0];
	msgBox.innerHTML = "";
	msgBox.className = "";
}

function CheckItem(obj)
{
	obj.parentNode.parentNode.className = "";
	var msgBox = obj.parentNode.getElementsByTagName("span")[0];
	switch(obj.name) {
		case "userName":
			if(obj.value == "") {
				msgBox.innerHTML = "�û�������Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "passWord":
			if(obj.value == "") {
				msgBox.innerHTML = "���벻��Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "rePassWord":
			if(obj.value == "") {
				msgBox.innerHTML = "ȷ�����벻��Ϊ��";
				msgBox.className = "error";
				return false;
			} else if(obj.value != document.getElementById("passWord").value) {
				msgBox.innerHTML = "������������벻��ͬ";
				msgBox.className = "error";
				return false;
			}
			break;
		case "address":
			if(obj.value == "") {
				msgBox.innerHTML = "�ʼĵ�ַ����Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "realName":
			if(obj.value == "") {
				msgBox.innerHTML = "��ʵ��������Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "guestName":
			if(obj.value == "") {
				msgBox.innerHTML = "�ǳƲ���Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "guestContent":
			if(obj.value == "") {
				msgBox.innerHTML = "�������ݲ���Ϊ��";
				msgBox.className = "error";
				return false;
			}	
		break;
	}
	return true;
}

function checkForm(frm)
{
	//var els = frm.getElementsByTagName("input");
	var els = frm.elements;
	for(var i=0; i<els.length; i++) {
		//if(typeof(els[i].getAttribute("onblur")) == "function") {
			if(!CheckItem(els[i])) return false;
		//}
	}
	return true;
}


function reloadPrice(id, status,stock)
{
	var price = document.getElementById("price_id_" + id).getElementsByTagName("input")[0].value;
	var priceBox = document.getElementById("price_id_" + id).getElementsByTagName("span")[0];
	var number = document.getElementById("number_id_" + id);
	if(status==true) {
		number.value++;		
		if(number.value>stock){
			alert("Ŀǰ��治��(ʣ��"+stock+"��)���뷵���޸Ŀ������!");
			priceBox.innerHTML = "��" + price * number.value;
			number.value = stock;
			number.select();
			return false;
		}
	} else if(status==false){
		if(number.value == 1) {
			priceBox.innerHTML = "��" + price * number.value;
			return false;
		} else {
			number.value--;			
		}
	}

	priceBox.innerHTML = "��" + price * number.value;
	doAjax(null,"servlet/ChangeNumsAction?rnd="+Math.random()+"&ep_id="+id+"&newNums="+number.value);
	
}