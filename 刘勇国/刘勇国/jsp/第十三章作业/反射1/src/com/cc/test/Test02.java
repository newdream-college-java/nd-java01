package com.cc.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test02 {
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("com.cc.test.A");
		A a1=(A) c.newInstance();
		Field f1=c.getDeclaredField("a");
		Field f2=c.getDeclaredField("b");
		f2.setAccessible(true);
		f1.set(a1, 6);
		f2.set(a1,10);
		Method m1 =  c.getDeclaredMethod("showA");
		Method m2 =  c.getDeclaredMethod("showB");
		m2.setAccessible(true);
		m1.invoke(a1);
		m2.invoke(a1);
	}
}