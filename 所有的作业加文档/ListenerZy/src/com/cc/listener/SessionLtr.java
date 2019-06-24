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
		System.out.println("sessionlister创建");
	}

	public void sessionCreated(HttpSessionEvent sce) {
		System.out.println("sessionLister开始");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		// 1.得到request
		HttpSession session = sce.getSession();
		session.setAttribute("date", df.format(new Date()));
	}

	public void sessionDestroyed(HttpSessionEvent sce) {
		System.out.println("sessionLister销毁");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		System.out.println(df1.format(new Date()));// new Date()为获取当前系统时间
		// 1.得到request
		HttpSession session = sce.getSession();
		try {

			String date2 = (String) session.getAttribute("date");
			Date datej = df1.parse(df1.format(new Date()));
			System.out.println("传过来的时间" + date2);
			Date datek = df1.parse(date2);
			// System.out.println(datek);
			System.out.println("开始的" + datek.getTime());
			System.out.println("结束的" + datej.getTime());
			long time = ((datej.getTime() - datek.getTime())); 
			session.setAttribute("time", time);
			System.out.println(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
