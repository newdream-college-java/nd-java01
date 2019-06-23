package com.dy.listener;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLtr implements ServletContextListener{
	private String date;
	public ContextLtr(){
		System.out.println("ContextLtr�����ɹ���");
	}
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        System.out.println("����ʱ��Ϊ��"+df.format(new Date()));
		String date2=df.format(new Date()); 
		String path = sce.getServletContext().getRealPath("WEB-INF/count.properties");
		PrintWriter out = null;
		FileWriter fw=null;
        try {
        	fw= new FileWriter(path);
        	out = new PrintWriter(fw);
			Date d1 = df.parse(date);
			Date d2=df.parse(date2);
			long diff = d1.getTime() - d2.getTime();
			long days = diff / (1000 * 60 * 60 * 24);
			ServletContext application = sce.getServletContext();
			out.write("��ʼʱ�䣺"+d1);
			out.write("����ʱ��"+d2);
			out.write("ʱ���"+days);	        
			System.out.println("ʱ��Ϊ��"+days);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			 try {
	                out.close();
	                fw.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }	
		}
		 System.out.println("application����.....");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        System.out.println("��ʼʱ��Ϊ��"+df.format(new Date()));
		 date=df.format(new Date());
	}

}
