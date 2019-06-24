package com.cc.ho;

import com.cc.po.Student;

public class Test01 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	//Student01 st=new Student01();
	//1.获取类的字节码文件对象方式一：class.forName();//即使加载
	//Class<?> stuClazz=Class.forName("com.cc.ho.Student01");
	//System.out.println(stuClazz);
	//根据class字节码，实例化对象？
	//Student01 stu=(Student01)stuClazz.newInstance();//newInstance新实例(会出现new了2次)
	//2.获取类的字节码文件对象方式二：对象.getClass();
	//Student01 s=new Student01();
	//Class stuClazz2=s.getClass();//s.getClass()得到的是class com.cc.ho.Student01
	//System.out.println(stuClazz2.newInstance());//com.cc.ho.Student01@dc8569这个代表什么
	//3.获取类的字节码文件对方式三：类名.class
	Class stuClass4=Student01.class;//延迟加载
	//System.out.println(stuClass4.newInstance());
	stuClass4.newInstance();
}
}
