package com.yb.factoryStatic;

import com.yb.factoryStatic.MailSender;
import com.yb.factoryStatic.Sender;
import com.yb.factoryStatic.SmsSender;

public class SendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
