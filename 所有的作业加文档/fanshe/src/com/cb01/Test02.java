package com.cb01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test02 {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, SecurityException, NoSuchFieldException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		// A a=new A();
		Class c1 = A.class;
		// 要赋值必须创建A的对象newInstance()
		A stu = (A) c1.newInstance();
		// 2.获取属性
		// 2.1获取公有属性
		Field f1 = c1.getField("a");
		//System.out.println(f1);
		stu.a = 6;
		/* 通过反射的方式，给属性赋值 */
		f1.set(stu, 6);
		System.out.println(f1.get(stu));
		//2.2获取私有属性
		Field f2=c1.getDeclaredField("b");
		/*暴力解锁*/
		f2.setAccessible(true);
		f2.set(stu, 10);
		System.out.println(f2.get(stu));
		//3.获取方法
		//3.1获取公有方法
		Method m1=c1.getMethod("showA");
		//3.2获取私有方法
		Method m2=c1.getDeclaredMethod("showB");
		//3.1调用setName()方法，其实就是赋值
		m1.invoke(stu);
		m2.invoke(stu);
		//System.out.println(m1.invoke(stu));
		// Field[] fields=c1.getDeclaredFields();
		// Method m1=c1.getMethod("", parameterTypes)
	}
}
