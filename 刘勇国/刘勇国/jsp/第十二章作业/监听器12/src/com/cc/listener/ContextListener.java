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

		//上下文对象销毁时，将当前访问量写入文件
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
		   n = pro.getProperty("counter");//从计数文件中读取该站的历史访问量
		   arg0.getServletContext().setAttribute("counter", Integer.parseInt(pro.getProperty("counter")));
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   System.out.println("读取计数文件失败");
		  }
		  System.out.println("创建上下文对象" + n);
		} 
	}