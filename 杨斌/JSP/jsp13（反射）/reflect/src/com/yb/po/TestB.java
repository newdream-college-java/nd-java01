package com.yb.po;

import java.lang.reflect.Constructor;

public class TestB {
	public static void main(String[] args) throws Exception {
		Class c=B.class;
		System.out.println(c);
		B b=(B) c.newInstance();
		//调用默认构造
		Constructor ct1=c.getConstructor();
		B b1=(B) ct1.newInstance();
		//调用有参构造
		Constructor ct2=c.getConstructor(int.class);
		B b2=(B) ct2.newInstance(5);
		Constructor ct3=c.getConstructor(Integer.class);
		B b3=(B) ct3.newInstance(3);	
	}
}
