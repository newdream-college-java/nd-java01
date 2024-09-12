package com.yb.po;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestA {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException  {
		Class c=Class.forName("com.yb.po.A");
		Field f1=c.getField("a");		
		A aa=(A) c.newInstance();
		Field[] fields=c.getDeclaredFields();
		Method[] methods=c.getMethods();
		for(Field fd:fields){
			System.out.println("名字="+fd.getName()+"\n类型="+fd.getType()+"\n修饰符="+soEasy(fd.getModifiers()));
		}
		for(Method mt:methods){
			System.out.println("名字="+mt.getName()+"\n类型="+mt.getReturnType()+"\n修饰符="+soEasy(mt.getModifiers()));
			Class[] clazz=mt.getParameterTypes();
			if(clazz.length==0){
				System.out.println("此方法没有参数");
			}
			for(Class cl:clazz){
				System.out.println("参数"+cl.getName());
			}
		}
	}
	public static String soEasy(int methods){
		if(methods==1){
			return "public";
		}else if(methods==2){
			return "private";
		}else if(methods==3){
			return "protected";
		}
		return "默认修饰符";
	}
}
