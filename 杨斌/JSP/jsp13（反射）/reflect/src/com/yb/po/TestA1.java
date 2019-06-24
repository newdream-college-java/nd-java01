package com.yb.po;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestA1 {
	public static void main(String[] args) throws Exception{
		Class c=A.class;
		Field fa=c.getField("a");
		Field fb=c.getDeclaredField("b");
		fb.setAccessible(true);
		A a=(A)c.newInstance();
		fa.set(a, 6);
		fb.set(a, 10);
		Method showA=c.getDeclaredMethod("showA");
		Method showB=c.getDeclaredMethod("showB", int.class);
		showB.setAccessible(true);
		showA.invoke(a);
		showB.invoke(a,6);
		
	}
	
}
