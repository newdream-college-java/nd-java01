package com.java.java17.Z2;

public class Sn extends Phone implements Audio,Flash,Call{
	public Sn(String brand,String xh){
		setBrand(brand);
		setXh(xh);	
		System.out.println("这是一款型号为"+getXh()+"的"+getBrand()+"手机");
	}
	@Override
	public void show() {
		System.out.println("开始播放音乐《热雪》。。。。。。。");
		
	}
	@Override
	public void show1() {
		System.out.println("发送文字信息。。。。。。。");
		
	}
	@Override
	public void show2() {
		System.out.println("开始语音通话。。。。。。。\n\n");
		
	}
	
}
