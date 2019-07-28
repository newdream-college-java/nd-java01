package com.yb.factorypo;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("ÕâÊÇsms sender");	
	}

}
