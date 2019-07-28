package com.cb.dao.impl;

import com.cb.dao.Provider;
import com.cb.dao.Sender;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
