package com.cb01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test02 {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, SecurityException, NoSuchFieldException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		// A a=new A();
		Class c1 = A.class;
		// Ҫ��ֵ���봴��A�Ķ���newInstance()
		A stu = (A) c1.newInstance();
		// 2.��ȡ����
		// 2.1��ȡ��������
		Field f1 = c1.getField("a");
		//System.out.println(f1);
		stu.a = 6;
		/* ͨ������ķ�ʽ�������Ը�ֵ */
		f1.set(stu, 6);
		System.out.println(f1.get(stu));
		//2.2��ȡ˽������
		Field f2=c1.getDeclaredField("b");
		/*��������*/
		f2.setAccessible(true);
		f2.set(stu, 10);
		System.out.println(f2.get(stu));
		//3.��ȡ����
		//3.1��ȡ���з���
		Method m1=c1.getMethod("showA");
		//3.2��ȡ˽�з���
		Method m2=c1.getDeclaredMethod("showB");
		//3.1����setName()��������ʵ���Ǹ�ֵ
		m1.invoke(stu);
		m2.invoke(stu);
		//System.out.println(m1.invoke(stu));
		// Field[] fields=c1.getDeclaredFields();
		// Method m1=c1.getMethod("", parameterTypes)
	}
}
