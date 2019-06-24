package com.cc.zy02;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c1=Class.forName("com.cc.zy02.A");//º¥ πº”‘ÿ
		//System.out.println(c1);
		System.out.println("===========================");
		Class c2=A.class;
		A a1=(A)c2.newInstance();
		//System.out.println(a1);
	}
}
