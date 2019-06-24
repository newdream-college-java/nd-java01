package com.cc.Test;

import com.cc.Student.Student;

public class Test2father {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//得到一个类的所有父类
	/*	Class clazz=Student.class;
		if(clazz!=null){
			System.out.println("父类"+clazz.getName());
			System.out.println(1);
			clazz=clazz.getSuperclass();//这个就是得到他的父类
			System.out.println("父类"+clazz);
		}
		Class[] cl=clazz.getInterfaces();
		for(int i=0;i<cl.length;i++){
			System.out.println(2);
			System.out.println("Object接口"+cl[i].getName());
		}
		System.out.println(3);
		System.out.println("Student父类的接口"+clazz.getInterfaces());*/
		
		//包装类和基础类型获取class
		Class clazz=Integer.class;
		System.out.println(clazz);
	}
}















