package com.dy.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.dy.po.A;

public class test2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchFieldException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class cl=A.class;
		A a=(A) cl.newInstance();
		Field afield=cl.getField("a");
		Field bfield=cl.getDeclaredField("b");
		bfield.setAccessible(true);
		afield.set(a,6);
		bfield.set(a,10);
		Method m1=cl.getMethod("showA");
		Method m2=cl.getDeclaredMethod("showB");
		m2.setAccessible(true);
		m1.invoke(a);
		m2.invoke(a);
		
	}
}
