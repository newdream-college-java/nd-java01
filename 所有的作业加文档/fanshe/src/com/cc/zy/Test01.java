package com.cc.zy;

import com.cc.zy.Student01;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Student01 st=new Student01();
		//1.获取类的字节码文件对象方式一：class.forName();//即使加载
		//Class<?> stuClazz=Class.forName("com.cc.zy.Student01");
		//System.out.println(stuClazz);
		//2.获取类的字节码文件对方式三：类名.class
		//Class stuClass4=Student01.class;//延迟加载
		//System.out.println(stuClass4.newInstance());
		//stuClass4.newInstance();
		//2.获取类的字节码文件对象方式二：对象.getClass();
		Student01 s=new Student01();
		Class stuClazz2=s.getClass();
	}
}
