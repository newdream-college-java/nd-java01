package com.yb.factoryStatic;

public class SendFactoryTest {
	public static void main(String[] args) {
		Sender sender=SendFactory.produceMail();
		sender.send();		
	}
}
