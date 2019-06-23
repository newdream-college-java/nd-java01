package com.dy.listener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLtr implements ServletRequestListener{
	private String date;
	public RequestLtr() {
	        System.out.println("RequestLtr�����ɹ�����");
	    }
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        System.out.println("����ʱ��Ϊ��"+df.format(new Date()));
		String date2=df.format(new Date());        
        try {
			Date d1 = df.parse(date);
			Date d2=df.parse(date2);
			long diff = d1.getTime() - d2.getTime();
			long days = diff / (1000 * 60 * 60 * 24);
			System.out.println("ʱ��Ϊ��"+days);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("request����");
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
         System.out.println("��ʼʱ��Ϊ��"+df.format(new Date()));
		 date=df.format(new Date());
	}

}
