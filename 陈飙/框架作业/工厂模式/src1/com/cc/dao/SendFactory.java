package com.cc.dao;

import com.cb.dao.Sender;
import com.cb.dao.impl.MailSender;
import com.cb.dao.impl.SmsSender;

public class SendFactory {
	public static Sender produceMail(){
		return new MailSender();
		
	}
	
	public static Sender produceMaiSms(){
		return new SmsSender();
	}
}
