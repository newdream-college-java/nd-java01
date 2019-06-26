package com.cc.listener;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		 Properties pro = new Properties(); 
		  try {
		   pro.setProperty("counter", arg0.getServletContext().getAttribute("counter").toString());
		   String filePath = arg0.getServletContext().getRealPath("/WEB-INF/classes/db/count.txt");

		//�����Ķ�������ʱ������ǰ������д���ļ�
		   OutputStream os = new FileOutputStream(filePath);
		   pro.store(os, null);
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		arg0.getServletContext().setAttribute("online", 0);
		  Properties pro = new Properties();
		  InputStream in = ContextListener.class.getResourceAsStream("/db/count.txt");
		  String n = null;
		  try {
		   pro.load(in);
		   n = pro.getProperty("counter");//�Ӽ����ļ��ж�ȡ��վ����ʷ������
		   arg0.getServletContext().setAttribute("counter", Integer.parseInt(pro.getProperty("counter")));
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   System.out.println("��ȡ�����ļ�ʧ��");
		  }
		  System.out.println("���������Ķ���" + n);
		} 
	}