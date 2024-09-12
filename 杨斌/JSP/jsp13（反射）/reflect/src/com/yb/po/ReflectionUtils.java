package com.yb.po;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
	public Object show(Object obj,String name) throws Exception{
		Class a=obj.getClass();
		Object o1=a.newInstance();
		Field f1=a.getField(name);
		f1.get(o1);
		return f1.get(o1);
	}
	public void showB(Object obj,String name,Class[] clazz) throws Exception{
		Class a=obj.getClass();
		Object o1=a.newInstance();
		Method md=a.getMethod(name, clazz);
		md.invoke(o1,6,"56");
	}
}
