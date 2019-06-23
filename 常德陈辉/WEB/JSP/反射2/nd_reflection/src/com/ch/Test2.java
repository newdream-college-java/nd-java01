package com.ch;

import java.lang.reflect.Field;

public class Test2 {
	public static void main(String[] args) throws Exception {
		Class cla = A.class;
		A a = (A) cla.newInstance();
		Field field = cla.getField("a");
		field.set(a,6);
		a.showA();
		//私有属性需要暴力破解
		Field field2 = cla.getDeclaredField("b");
		field2.setAccessible(true);
		field2.set(a,10);
		a.showB();
	}
}
