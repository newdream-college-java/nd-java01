package com.ch.test3;

import java.lang.reflect.Constructor;

import com.sun.faces.util.ReflectionUtils;

public class Test3 {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.ch.test3.B");
		//B b=(B) c.newInstance();
		//System.out.println(b);
		Constructor cs = c.getConstructor();
		B b = (B) cs.newInstance();
		System.out.println(b);
		Constructor constructor = c.getConstructor(int.class);
		B b1=(B) constructor.newInstance(1);
		System.out.println(b1);
		Constructor constructor1 = c.getConstructor(Integer.class);
		B b2=(B) constructor1.newInstance(1);
		System.out.println(b2);
	}

}
