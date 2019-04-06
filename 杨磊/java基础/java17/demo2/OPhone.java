package com.nd.yl.demo2;

public class OPhone extends Phone implements Old {
	public OPhone() {
		super("索尼爱立信", "G5O2c");
	}

	public void message() {
		System.out.println("正在发送文字信息》》》");

	}

	public void phone() {
		System.out.println("正在语言通话》》》");

	}

	public void print() {
		System.out.println("这是一款型号为" + getType() + "的" + getBrand() + "手机");

	}

}
