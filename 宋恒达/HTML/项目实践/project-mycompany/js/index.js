var index = 0;
//获取相应的标签对象
var bannerImage = document.getElementById('bannerImage');
var button=document.getElementById('button');
var button1 = document.getElementById("bannerButton1");
var button2 = document.getElementById("bannerButton2");
var button3 = document.getElementById("bannerButton3");
var button4 = document.getElementById("bannerButton4");
var button5 = document.getElementById("bannerButton5");
button1.style.backgroundColor="#3272CA";
var deplomaButton1=document.getElementById("deplomaButton1");
var deplomaImage2=document.getElementById("deplomaImage2");
var deplomaButton2=document.getElementById("deplomaButton2");
var deplomaImage1=document.getElementById("deplomaImage1");
//证书图片切换
deplomaButton1.style.backgroundColor="#3272CA";
//deplomaButton1点击事件
deplomaButton1.onclick=function(){
	deplomaButton1.style.backgroundColor="#3272CA";
	deplomaButton2.style.backgroundColor="#59CAF4";
	deplomaImage2.style.display="none";
	deplomaImage1.style.display="block";
}
//deplomaButton2点击事件
deplomaButton2.onclick=function(){
	deplomaButton2.style.backgroundColor="#3272CA";
	deplomaButton1.style.backgroundColor="#59CAF4";
	deplomaImage1.style.display="none";
	deplomaImage2.style.display="block";
}
//图片轮播
function nextImage() {
	if (index > 5) {
		index = 0;
	}
	switch(index){
		case 0:
		case 5:
		button1.style.backgroundColor="#3272CA";
		button2.style.backgroundColor="#59CAF4";
		button3.style.backgroundColor="#59CAF4";
		button4.style.backgroundColor="#59CAF4";
		button5.style.backgroundColor="#59CAF4";
		break;
		case 1:
		button2.style.backgroundColor="#3272CA";
		button1.style.backgroundColor="#59CAF4";
		button3.style.backgroundColor="#59CAF4";
		button4.style.backgroundColor="#59CAF4";
		button5.style.backgroundColor="#59CAF4";
		break;
		case 2:
		button3.style.backgroundColor="#3272CA";
		button1.style.backgroundColor="#59CAF4";
		button2.style.backgroundColor="#59CAF4";
		button4.style.backgroundColor="#59CAF4";
		button5.style.backgroundColor="#59CAF4";
		break;
		case 3:
		button4.style.backgroundColor="#3272CA";
		button1.style.backgroundColor="#59CAF4";
		button2.style.backgroundColor="#59CAF4";
		button3.style.backgroundColor="#59CAF4";
		button5.style.backgroundColor="#59CAF4";
		break;
		case 4:
		button5.style.backgroundColor="#3272CA";
		button1.style.backgroundColor="#59CAF4";
		button2.style.backgroundColor="#59CAF4";
		button3.style.backgroundColor="#59CAF4";
		button4.style.backgroundColor="#59CAF4";
		break;
	}
	var newRight = index * 949;
	// 	if(bannerImage.style.right=="3800px"){
	// 		newRight=0;
	// 	}else{
	// newRight=parseInt(bannerImage.style.right)+950;
	// }
	bannerImage.style.right = newRight + "px";
	index++;

}
//设置定时器
var timer = null;

function autoPlay() {
	timer = setInterval(function() {
		nextImage();
	}, 2000);
}
autoPlay();
// 轮播图按键监听
//鼠标事件监听来决定是否关闭或者开启定时器
button.onmouseenter=function(){
	clearInterval(timer);
}
button.onmouseleave=function(){
	autoPlay();
}
button1.onclick = function() {
	index = 0;
	nextImage();
// 	button1.style.backgroundColor="#3272CA";
// 	button2.style.backgroundColor="#59CAF4";
// 	button3.style.backgroundColor="#59CAF4";
// 	button4.style.backgroundColor="#59CAF4";
// 	button5.style.backgroundColor="#59CAF4";
}

button2.onclick = function() {
	index = 1;
	nextImage();
// 	button2.style.backgroundColor="#3272CA";
// 	button1.style.backgroundColor="#59CAF4";
// 	button3.style.backgroundColor="#59CAF4";
// 	button4.style.backgroundColor="#59CAF4";
// 	button5.style.backgroundColor="#59CAF4";
}
button3.onclick = function() {
	index = 2;
	nextImage();
// 	button3.style.backgroundColor="#3272CA";
// 	button1.style.backgroundColor="#59CAF4";
// 	button2.style.backgroundColor="#59CAF4";
// 	button4.style.backgroundColor="#59CAF4";
// 	button5.style.backgroundColor="#59CAF4";
}
button4.onclick = function() {
	index = 3;
	nextImage();
// 	button4.style.backgroundColor="#3272CA";
// 	button1.style.backgroundColor="#59CAF4";
// 	button2.style.backgroundColor="#59CAF4";
// 	button3.style.backgroundColor="#59CAF4";
// 	button5.style.backgroundColor="#59CAF4";
}
button5.onclick = function() {
	index = 4;
	nextImage();	
// 	button5.style.backgroundColor="#3272CA";
// 	button1.style.backgroundColor="#59CAF4";
// 	button2.style.backgroundColor="#59CAF4";
// 	button3.style.backgroundColor="#59CAF4";
// 	button4.style.backgroundColor="#59CAF4";
}

