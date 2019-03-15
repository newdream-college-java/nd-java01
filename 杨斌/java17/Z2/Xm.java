package com.java.java17.Z2;

public class Xm extends Phone implements Internet,Video,Photograph,Flash,Call{
	public Xm(String brand,String xh){
		setBrand(brand);
		setXh(xh);	
		System.out.println("这是一款型号为"+getXh()+"的"+getBrand()+"手机");
	}
	@Override
	public void show3() {
		System.out.println("已经启动移动网络.........");
		
	}

	@Override
	public void show4() {
		System.out.println("开始播放视频《小时代》.........");
		
	}

	@Override
	public void show5() {
		System.out.println("咔嚓.........拍照成功");
		
	}

	@Override
	public void show1() {
		System.out.println("发送带图片与文字的信息.........");
		
	}

	@Override
	public void show2() {
		System.out.println("开始视频通话.........");
		
	}

}
