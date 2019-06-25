package com.cc.listener;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.faces.application.Application;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequest;

public class ContextLtr implements ServletContextListener {
	public ContextLtr() {
		System.out.println("application�����ɹ�");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("application����");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
		System.out.println(df1.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		// 1.�õ�request
		ServletContext application = sce.getServletContext();
		try {

			String date2 = (String) application.getAttribute("date");
			Date datej = df1.parse(df1.format(new Date()));
			System.out.println("��������ʱ��" + date2);
			Date datek = df1.parse(date2);
			// System.out.println(datek);
			System.out.println("��ʼ��" + datek.getTime());
			System.out.println("������" + datej.getTime());
			long time = ((datej.getTime() - datek.getTime()) / 1000);
			application.setAttribute("time", time);
			System.out.println(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 1.д�������ļ�
		String path = sce.getServletContext().getRealPath(
				"WEB-INF/count.properties");
		// �õ�ps���󣬲������ļ���ps
		FileWriter fw = null;
		PrintWriter out = null;
		try {
			fw = new FileWriter(path);// Ҫд����ļ�
			Properties ps = new Properties();// ��ȡJava--.properties�������ļ�
			out = new PrintWriter(fw);// ���ı��ļ�д������
			// 1.3�����ݴ���ps
			String  time = (String)application.getAttribute("time").toString();
			ps.setProperty("time1", time + "");// Ҫд + ""��Ȼ�ᱨ��
			// setProperty(String key, String value) ���� Hashtable �ķ���
			// put����ͨ�����û����put���������� ��ֵ�ԡ�
			// д������
			ps.list(out);
			// list(PrintStream out) ���������б��ӡ��ָ������������˷������ڵ��Ժ�����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				out.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�������ݳɹ�������");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("application��ʼ");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		// 1.�õ�request
		ServletContext application = sce.getServletContext();
		application.setAttribute("date", df.format(new Date()));
	}

}
