package com.dy.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.dy.po.B;

public class test3 {
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Class c=Class.forName("com.dy.po.B");
		Constructor ct=c.getConstructor();
		B b=(B)ct.newInstance();
		Constructor ct2=c.getConstructor(int.class);
		B b2=(B)ct2.newInstance(10);
		Constructor ct3=c.getConstructor(Integer.class);
		B b3=(B)ct3.newInstance(5);
	}
}
