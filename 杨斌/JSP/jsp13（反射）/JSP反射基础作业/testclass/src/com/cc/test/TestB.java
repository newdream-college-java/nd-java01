package com.cc.test;

import java.lang.reflect.Constructor;

public class TestB {
	public static void main(String[] args)throws Exception{
		Class c =  Class.forName("com.cc.test.B");
		//�޲ι���
		Constructor ct1 =  c.getConstructor();
		B b1=(B) ct1.newInstance();
		//�вι���int
		Constructor ct2=c.getConstructor(int.class);
		B b2=(B) ct2.newInstance(2);
		//�вι���Integer
		Constructor ct3=c.getConstructor(Integer.TYPE);
		B b3=(B) ct3.newInstance(3);
	}
}
