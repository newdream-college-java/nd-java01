package com.yb.factoryStatic;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("ÕâÊÇsms sender");	
	}

}
