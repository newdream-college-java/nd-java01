//题8：设置显示隐藏商品显示
	function Opencommodity(obj){
		var scs = document.getElementById("shopping_commend_sort");
		if(scs.style.display=="none"){
			obj.src="images/shopping_arrow_up.gif";
			scs.style.display="block";
		}else{
			obj.src="images/shopping_arrow_down.gif";
			scs.style.display="none";
		}
	}
	function productCount(){
		var myTableTr=document.getElementById("myTableProduct").getElementsByTagName("tr");//创建一个变量用来存放行数据
			integral=0;//用来存放商品积分
			total=0;//用来存放价格
			save=0;//用来存放节约的钱
		for(var i=0;i<myTableTr.length;i++){
			point=parseInt(myTableTr[i].getElementsByTagName("td")[1].innerHTML);//获取单品积分再将单品积分转换为数字
			price=parseInt(myTableTr[i].getElementsByTagName("td")[2].innerHTML.substring(1))//获取市场价并转化为数字
			ddprice=parseFloat(myTableTr[i].getElementsByTagName("td")[3].innerHTML.substring(1));//获取当当并转化为数字
			number=parseInt(myTableTr[i].getElementsByTagName("td")[4].getElementsByTagName("input")[0].value);//文本框中的数值并转化为数字
			integral+=point*number;
			total+=ddprice*number;
			save+=(price-ddprice)*number;
		}
		document.getElementById("product_save").innerHTML=save.toFixed(2);
		document.getElementById("product_total").innerHTML=total.toFixed(2);
		document.getElementById("product_integral").innerHTML=integral;
	}
	function deleteMerchandise(obj){
		 var Table=obj.parentNode;//获取父节点，以便删除
		 if(confirm("你确定要删除此商品么")){
		 	Table.removeChild(obj);//删除列表中的商品
		 	productCount();//刷新数据
		 }
		 
	}