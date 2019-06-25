function reloadPrice(obj,status,stock)
{
	var pr = document.getElementById("price_id").getElementsByTagName("input")[0];
	var price = document.getElementById("price_id").getElementsByTagName("input")[0].value;
	var priceBox = document.getElementById("price_id").getElementsByTagName("h1")[0];
	var number = obj.parentNode.getElementsByTagName("input")[0];
	var sum=obj.parentNode.parentNode.getElementsByTagName("input")[1].value;
	price=parseInt(price);
	if(status==true) {
		number.value++;			
		if(number.value>stock){
			alert("目前库存不足(剩余"+stock+"件)，请返回修改库存数量!");
			priceBox.innerHTML = "<b>￥</b>" + pr.value+".00";
			number.value = stock;
			number.select();
			return false;
		}
		pr.value=Number(price)+Number(sum*1);
		priceBox.innerHTML = "<b>￥</b>" + pr.value+".00";
		
	} else if(status==false){
		if(number.value == 0) {
			
			priceBox.innerHTML = "<b>￥</b>" + pr.value+".00";
			return false;
		} else {
			number.value--;	
			pr.value=Number(price)-Number(sum*1);	
			priceBox.innerHTML = "<b>￥</b>" + pr.value+".00";	
		}			
	}

}