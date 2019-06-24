package com.cc.listener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLtr implements ServletRequestListener{
	public RequestLtr(){
		System.out.println("request监听器创建成功");
	}

	public void requestDestroyed(ServletRequestEvent req) {
		System.out.println("request监听器销毁");
		//在销毁的时候把得到的结果放入的日志里
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df1.format(new Date()));// new Date()为获取当前系统时间
		//String date1=df1.format(new Date());
		//Date datek = null;
		try {
			 ServletRequest request= req.getServletRequest();
				String date2=(String)request.getAttribute("date");
				
				Date datej = df1.parse(df1.format(new Date()));
				System.out.println("传过来的时间"+date2);
				Date datek=df1.parse(date2);
				System.out.println(datek);
				System.out.println(datek.getTime());
				long day=((datej.getTime()-datek.getTime())/1000);
				 System.out.println(day);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void requestInitialized(ServletRequestEvent req) {
		System.out.println("request监听器开始");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		//1.得到request
		 ServletRequest request= req.getServletRequest();
		 request.setAttribute("date", df.format(new Date()));
	}

}
