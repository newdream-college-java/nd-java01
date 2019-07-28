package com.yb.factorypo;

public class SendFactoryTest {
	public static void main(String[] args) {
		SendFactory sd=new SendFactory();
		System.out.println(sd.produce("mail"));
		System.out.println(sd.produce("sms"));
	}
}
