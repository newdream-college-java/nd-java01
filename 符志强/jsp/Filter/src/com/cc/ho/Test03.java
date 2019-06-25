package com.cc.ho;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException {
		//获取系统类加载器（本质就是一个类）
		ClassLoader sysLoader=ClassLoader.getSystemClassLoader();
		System.out.println(ClassLoader.getSystemClassLoader());
		Class clazz01=sysLoader.loadClass("com.cc.ho.Student01");
		System.out.println(sysLoader.loadClass("com.cc.ho.Student01"));
		  System.out.println(sysLoader+"--"+clazz01.getName());
		  //获取扩展加载器（本质就是一个类）
		  ClassLoader extLoader=sysLoader.getParent();
		  System.out.println(extLoader);
		  //获取根类加载器（引导）
		  ClassLoader rootLoader=extLoader.getParent();//父类加载器
		  System.out.println(rootLoader);
	}
}
