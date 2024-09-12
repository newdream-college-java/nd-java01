package com.yb.factoryer;

import com.yb.factoryer.MailSender;
import com.yb.factoryer.Sender;
import com.yb.factoryer.SmsSender;

public class SendFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	public Sender produceSms(){
		return new SmsSender();
	}
}
