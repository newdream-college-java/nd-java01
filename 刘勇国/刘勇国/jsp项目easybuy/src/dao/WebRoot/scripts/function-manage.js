function Delete(url)
{
	if(confirm("ȷ��ɾ����")){
		location.href = url;
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
	//obj.parentNode.parentNode.className = "";
	var msgBox = obj.parentNode.getElementsByTagName("span")[0];
	switch(obj.name) {
		case "title":
			if(obj.value == "") {
				msgBox.innerHTML = "���ⲻ��Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "content":
			if(obj.value == "") {
				msgBox.innerHTML = "���ݲ���Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "replyContent":
			if(obj.value == "") {
				msgBox.innerHTML = "�ظ����ݲ���Ϊ��";
				msgBox.className = "error";
				return false;
			} else if(obj.value != document.getElementById("passWord").value) {
				msgBox.innerHTML = "������������벻��ͬ";
				msgBox.className = "error";
				return false;
			}
			break;
		case "productName":
			if(obj.value == "") {
				msgBox.innerHTML = "��Ʒ���Ʋ���Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "productPrice":
			if(obj.value == "") {
				msgBox.innerHTML = "��Ʒ�۸���Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "productStock":
			if(obj.value == "") {
				msgBox.innerHTML = "��Ʒ��治��Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "className":
			if(obj.value == "") {
				msgBox.innerHTML = "����������Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "userName":
			if(obj.value == "") {
				msgBox.innerHTML = "�û�������Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
		case "realName":
			if(obj.value == "") {
				msgBox.innerHTML = "��������Ϊ��";
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
		case "address":
			if(obj.value == "") {
				msgBox.innerHTML = "��ַ����Ϊ��";
				msgBox.className = "error";
				return false;
			}
			break;
	}
	return true;
}

function checkForm(frm)
{
	var els = frm.elements;
	for(var i=0; i<els.length; i++) {
		if(!CheckItem(els[i])) return false;		
	}
	return true;
}