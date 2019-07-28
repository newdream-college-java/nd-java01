package com.yb.factorypo;

public class SendFactory {
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("请输入正确的了恶性");
			return null;
		}		
	}
}
