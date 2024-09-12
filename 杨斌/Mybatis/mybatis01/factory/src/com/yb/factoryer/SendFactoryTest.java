package com.yb.factoryer;

public class SendFactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender=factory.produceMail();
		sender.send();		
	}
}
