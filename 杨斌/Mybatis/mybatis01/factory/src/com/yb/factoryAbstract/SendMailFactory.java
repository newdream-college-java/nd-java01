package com.yb.factoryAbstract;
import com.yb.factoryAbstract.Sender;

public class SendMailFactory implements Provider {
	public Sender produce(){
		return new MailSender();
	}
}
