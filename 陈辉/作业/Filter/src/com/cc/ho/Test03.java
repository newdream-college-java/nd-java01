package com.cc.ho;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ȡϵͳ������������ʾ���һ���ࣩ
		ClassLoader sysLoader=ClassLoader.getSystemClassLoader();
		System.out.println(ClassLoader.getSystemClassLoader());
		Class clazz01=sysLoader.loadClass("com.cc.ho.Student01");
		System.out.println(sysLoader.loadClass("com.cc.ho.Student01"));
		  System.out.println(sysLoader+"--"+clazz01.getName());
		  //��ȡ��չ�����������ʾ���һ���ࣩ
		  ClassLoader extLoader=sysLoader.getParent();
		  System.out.println(extLoader);
		  //��ȡ�����������������
		  ClassLoader rootLoader=extLoader.getParent();//���������
		  System.out.println(rootLoader);
	}
}
