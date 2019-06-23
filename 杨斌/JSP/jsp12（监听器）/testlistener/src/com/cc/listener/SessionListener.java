package com.cc.listener;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session = arg0.getSession();
		  int i = (Integer)session.getServletContext().getAttribute("online");//��õ�ǰ�����������������һ
		  session.getServletContext().setAttribute("online", i+1);
		  int n = (Integer)session.getServletContext().getAttribute("counter");//����һ���Ự�ͽ���������һ
		  session.getServletContext().setAttribute("counter", n+1);
		  Properties pro = new Properties(); 
		  try {//����������һ��ͽ����д���ļ�����ֹ�������رշ�������
		   pro.setProperty("counter", session.getServletContext().getAttribute("counter").toString());
		   String filePath = session.getServletContext().getRealPath("/WEB-INF/classes/db/count.txt");
		   OutputStream os = new FileOutputStream(filePath);
		   pro.store(os, null);
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   System.out.println("д������ļ�ʧ��");
		  }
		  System.out.println("����һ���Ự"); 
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		//���ٻỰ��ʱ����Ҫ������������һ
		  ServletContext context = arg0.getSession().getServletContext();
		  Integer i = (Integer)context.getAttribute("online");
		  context.setAttribute("online", i-1);
		  arg0.getSession().invalidate();
		  System.out.println("����һ���Ự");
		} 
	}


