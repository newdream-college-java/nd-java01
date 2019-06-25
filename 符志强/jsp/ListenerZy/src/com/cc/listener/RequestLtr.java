package com.cc.listener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLtr implements ServletRequestListener{
	public RequestLtr(){
		System.out.println("request�����������ɹ�");
	}

	public void requestDestroyed(ServletRequestEvent req) {
		System.out.println("request����������");
		//�����ٵ�ʱ��ѵõ��Ľ���������־��
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df1.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		//String date1=df1.format(new Date());
		//Date datek = null;
		try {
			 ServletRequest request= req.getServletRequest();
				String date2=(String)request.getAttribute("date");
				
				Date datej = df1.parse(df1.format(new Date()));
				System.out.println("��������ʱ��"+date2);
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
		System.out.println("request��������ʼ");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		//1.�õ�request
		 ServletRequest request= req.getServletRequest();
		 request.setAttribute("date", df.format(new Date()));
	}

}
