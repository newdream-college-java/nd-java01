package com.cc.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLtr implements ServletRequestListener {
	long start;
	long end;
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		end = System.currentTimeMillis();
		System.out.println("application������");
		System.out.println("����ʱ�� ��" + (end - start) + "ms");
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		start = System.currentTimeMillis();
		System.out.println("application��ʼ����");
	}

}