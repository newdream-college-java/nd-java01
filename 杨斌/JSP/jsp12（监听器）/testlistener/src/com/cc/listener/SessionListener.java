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
		  int i = (Integer)session.getServletContext().getAttribute("online");//获得当前在线人数，并将其加一
		  session.getServletContext().setAttribute("online", i+1);
		  int n = (Integer)session.getServletContext().getAttribute("counter");//创建一个会话就将访问量加一
		  session.getServletContext().setAttribute("counter", n+1);
		  Properties pro = new Properties(); 
		  try {//访问人数加一后就将结果写入文件（防止不正常关闭服务器）
		   pro.setProperty("counter", session.getServletContext().getAttribute("counter").toString());
		   String filePath = session.getServletContext().getRealPath("/WEB-INF/classes/db/count.txt");
		   OutputStream os = new FileOutputStream(filePath);
		   pro.store(os, null);
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   System.out.println("写入计数文件失败");
		  }
		  System.out.println("创建一个会话"); 
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		//销毁会话的时候，需要将在线人数减一
		  ServletContext context = arg0.getSession().getServletContext();
		  Integer i = (Integer)context.getAttribute("online");
		  context.setAttribute("online", i-1);
		  arg0.getSession().invalidate();
		  System.out.println("销毁一个会话");
		} 
	}


