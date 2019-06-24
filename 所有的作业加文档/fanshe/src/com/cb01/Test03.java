package com.cb01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test03 {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, SecurityException, NoSuchMethodException,
			IllegalArgumentException, InvocationTargetException {
		Class c1 = B.class;
		B stu1 = (B) c1.newInstance();

		/*
		 * 通过Student模板对象，创建出一个实例。 就是去动态的调用其无参构造方法
		 */
		Constructor ct1 = c1.getConstructor();
		B stu2 = (B) ct1.newInstance();
		// System.out.println(stu2);

		// 2.获取反射类一参数的构造方法
		Constructor ct2 = c1.getConstructor(int.class);
		B stu3 = (B) ct2.newInstance(5);
		// 2.1
		Constructor ct3 = c1.getConstructor(Integer.class);
		B stu4 = (B) ct3.newInstance(4);
	}

}
