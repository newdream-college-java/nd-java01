var ajaxObj;
function link(obj) {
	//1.��ȡʡ��
	//alert(1);
	var prod = obj.value;
	//
	alert(prod);
	//2.1�õ�ajax����XMLHttpRequest��-----�ֻ�
	createAjax();
	//2.2����url------���� ����2�˱��뷽ʽ����
	ajaxObj.open("post", "QueryCitySvl", true);
	//2.3��������------��绰
	//�����post�ύ����Ҫ��������ͷ
	ajaxObj.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded");
	ajaxObj.send("pid=" + prod);
	//ajaxObj.send(null);
	//2.4���ûص�����----�õ��ش����� 
	//3.������Ӧ�Ľ��������ע�����ʾ��Ϣ
	ajaxObj.onreadystatechange = callback; //js�¼���onblur="��������"��

}
//1.��ȡ�û���
//2.����Я���û������������������
//3.������Ӧ�Ľ��������ע�����ʾ��Ϣ
/*�Խ�����д���Ļص�����*/
function callback() {
	if (ajaxObj.readyState == 4 && ajaxObj.status == 200) {
		//console.log(ajaxObj);
		//ajaxObj.responseText :��ȡ�ı���Ϣ
		//ajaxObj.responseXml:��ȡxml�ĵ�����
		var xmlObj = ajaxObj.responseXML;
		console.log(xmlObj);
		//��ȡxml�ĵ���city�ڵ�  console.log(xmlObj);
		var citys = xmlObj.getElementsByTagName("city");
		//console.log(citys);
		//��ȡcity��select
		var citySelect = document.getElementById("city");
		citySelect.options.length = 1;
		for ( var i = 0; i < citys.length; i++) {
			var cid = citys[i].childNodes[0].childNodes[0].nodeValue;
			//console.log(cid);
			var cname = citys[i].childNodes[1].childNodes[0].nodeValue;
			//console.log(cname);
			//����option����
			var option = new Option(cname, cid);
			//console.log(option);
			//��option����select
			citySelect.add(option);
		}
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