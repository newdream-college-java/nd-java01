package com.cb;


import com.cb.dao.Sender;
import com.cc.dao.SendFactory;

public class FactoryTest {
public static void main(String[] args) {
	Sender sender=SendFactory.produceMail();
	sender.Send();
}
}
