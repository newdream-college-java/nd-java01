package com.cc.zy;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test02 {
	public static void main(String[] args) throws MalformedURLException,
			ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 4.��ȡ�ֽ����ļ�����ʽ�ģ�URLClassLoader
		URL url = new URL("http://127.0.0.1:8080/jar/st.jar");
		URL[] urls={url};
		
		URLClassLoader urlClassLoader=new URLClassLoader(urls);
		
		Class<?>stuClass=urlClassLoader.loadClass("com.cc.zy.Student01");
		
		stuClass.newInstance();//����Student��Ĺ��췽����
	}

}
