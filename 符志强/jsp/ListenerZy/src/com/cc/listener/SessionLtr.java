package com.cc.listener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionLtr implements HttpSessionListener {
	public SessionLtr() {
		System.out.println("sessionlister����");
	}

	public void sessionCreated(HttpSessionEvent sce) {
		System.out.println("sessionLister��ʼ");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		// 1.�õ�request
		HttpSession session = sce.getSession();
		session.setAttribute("date", df.format(new Date()));
	}

	public void sessionDestroyed(HttpSessionEvent sce) {
		System.out.println("sessionLister����");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
		System.out.println(df1.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		// 1.�õ�request
		HttpSession session = sce.getSession();
		try {

			String date2 = (String) session.getAttribute("date");
			Date datej = df1.parse(df1.format(new Date()));
			System.out.println("��������ʱ��" + date2);
			Date datek = df1.parse(date2);
			// System.out.println(datek);
			System.out.println("��ʼ��" + datek.getTime());
			System.out.println("������" + datej.getTime());
			long time = ((datej.getTime() - datek.getTime())); 
			session.setAttribute("time", time);
			System.out.println(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
