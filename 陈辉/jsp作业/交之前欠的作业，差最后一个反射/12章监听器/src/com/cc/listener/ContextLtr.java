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
		System.out.println("application创建成功");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("application销毁");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		System.out.println(df1.format(new Date()));// new Date()为获取当前系统时间
		// 1.得到request
		ServletContext application = sce.getServletContext();
		try {

			String date2 = (String) application.getAttribute("date");
			Date datej = df1.parse(df1.format(new Date()));
			System.out.println("传过来的时间" + date2);
			Date datek = df1.parse(date2);
			// System.out.println(datek);
			System.out.println("开始的" + datek.getTime());
			System.out.println("结束的" + datej.getTime());
			long time = ((datej.getTime() - datek.getTime()) / 1000);
			application.setAttribute("time", time);
			System.out.println(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 1.写入配置文件
		String path = sce.getServletContext().getRealPath(
				"WEB-INF/count.properties");
		// 得到ps对象，并加载文件到ps
		FileWriter fw = null;
		PrintWriter out = null;
		try {
			fw = new FileWriter(path);// 要写入的文件
			Properties ps = new Properties();// 读取Java--.properties的配置文件
			out = new PrintWriter(fw);// 向文本文件写入数据
			// 1.3将数据存入ps
			String  time = (String)application.getAttribute("time").toString();
			ps.setProperty("time1", time + "");// 要写 + ""不然会报错
			// setProperty(String key, String value) 调用 Hashtable 的方法
			// put。他通过调用基类的put方法来设置 键值对。
			// 写入数据
			ps.list(out);
			// list(PrintStream out) 将此属性列表打印到指定的输出流。此方法对于调试很有用
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
		System.out.println("保存数据成功！！！");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("application开始");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		// 1.得到request
		ServletContext application = sce.getServletContext();
		application.setAttribute("date", df.format(new Date()));
	}

}
