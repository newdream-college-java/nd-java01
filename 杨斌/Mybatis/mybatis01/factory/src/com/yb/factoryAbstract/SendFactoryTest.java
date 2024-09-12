package com.yb.factoryAbstract;

public class SendFactoryTest {
	public static void main(String[] args) {
		Provider pd=new SendMailFactory();
		Sender sender =pd.produce();	
		sender.send();
	}
}
