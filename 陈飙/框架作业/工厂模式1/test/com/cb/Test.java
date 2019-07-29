package com.cb;

import com.cb.dao.Provider;
import com.cb.dao.Sender;
import com.cb.dao.impl.SendMailFactory;

public class Test {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
