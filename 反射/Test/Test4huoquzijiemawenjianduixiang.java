package com.cc.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test4huoquzijiemawenjianduixiang {
	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		//4.��ȡ�ֽ����ļ�����ʽ�ģ�URLClassLoader
//		URL url=new URL("http://127.0.0.1:8080/jarbao/st.jar");
//		URL[] urls={url};
//		
//		URLClassLoader urlClassLoader=new URLClassLoader(urls);
//		Class<?> loadClass = urlClassLoader.loadClass("com.cc.Student.Student");
//		System.out.println(loadClass.getName());
//		Object newInstance = loadClass.newInstance();
	//���ȵ�һ����ȡjar������ҳ  ��Ϊjar������һ������
		URL url=new URL("http://127.0.0.1:8080/jarbao/st.jar");
		URL[] urls={url};
		
		URLClassLoader urlClassLoader=new URLClassLoader(urls);
		Class<?> loadClass = urlClassLoader.loadClass("com.cc.Student.Student");
//		System.out.println(loadClass);
//		System.out.println(loadClass.getName());
		loadClass.newInstance();

	}
}
