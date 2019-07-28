package com.cc.test;

import java.lang.reflect.Constructor;

public class TestB {
	public static void main(String[] args)throws Exception{
		Class c =  Class.forName("com.cc.test.B");
		//无参构造
		Constructor ct1 =  c.getConstructor();
		B b1=(B) ct1.newInstance();
		//有参构造int
		Constructor ct2=c.getConstructor(int.class);
		B b2=(B) ct2.newInstance(2);
		//有参构造Integer
		Constructor ct3=c.getConstructor(Integer.TYPE);
		B b3=(B) ct3.newInstance(3);
	}
}
