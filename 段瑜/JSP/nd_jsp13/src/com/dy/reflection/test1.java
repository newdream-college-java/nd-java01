package com.dy.reflection;

import java.util.HashMap;

public class test1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//第一种
		Class<?> hashCla=Class.forName("java.util.HashMap");
		HashMap has=(HashMap) hashCla.newInstance();
		System.out.println(has);
		//第二种
		HashMap h=new HashMap();
		Class has2=h.getClass();
		System.out.println(has2.newInstance());
		//第三种
		Class HashM=Class.forName("java.util.HashMap");
		System.out.println(HashM);
		
	}
}
