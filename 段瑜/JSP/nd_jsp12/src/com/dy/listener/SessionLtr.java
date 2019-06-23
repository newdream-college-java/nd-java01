package com.dy.listener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionLtr implements HttpSessionListener{
	private String date;
	public SessionLtr(){
		
	}
	public void sessionCreated(HttpSessionEvent apg) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        System.out.println("��ʼʱ��Ϊ��"+df.format(new Date()));
		date=df.format(new Date());
		System.out.println("SessionLtr��ʼ");
	}

	public void sessionDestroyed(HttpSessionEvent session) {
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
		System.out.println("SessionLtr����");
	}

}
