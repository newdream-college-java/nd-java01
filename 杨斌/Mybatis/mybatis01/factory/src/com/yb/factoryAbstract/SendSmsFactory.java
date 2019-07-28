package com.yb.factoryAbstract;
import com.yb.factoryAbstract.Sender;
import com.yb.factoryAbstract.SmsSender;

public class SendSmsFactory implements Provider {
	public  Sender produce(){
		return new SmsSender();
	}
}
