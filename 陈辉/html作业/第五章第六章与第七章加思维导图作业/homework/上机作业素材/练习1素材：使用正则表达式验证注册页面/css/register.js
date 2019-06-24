function shengri(obj){
	var hpyyd=document.ElementById("sr");
	var sr=obj.valuse;
	var reg=/^[a-z A-Z](?![0-9]+$)(?![a-zA-Z]+$)[a-z A-Z 1-9]{3,15}$/
	/;
	return reg.test(obj);
}