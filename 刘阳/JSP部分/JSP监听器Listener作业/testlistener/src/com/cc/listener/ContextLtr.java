package com.cc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLtr implements ServletContextListener {
	long start;
	long end;
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		end = System.currentTimeMillis();
		System.out.println("������");
		System.out.println("����ʱ�� ��" + (end - start) + "ms");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		start = System.currentTimeMillis();
		System.out.println("��ʼ����");
	}

}
