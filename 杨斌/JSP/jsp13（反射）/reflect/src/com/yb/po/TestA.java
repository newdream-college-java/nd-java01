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
			System.out.println("����="+fd.getName()+"\n����="+fd.getType()+"\n���η�="+soEasy(fd.getModifiers()));
		}
		for(Method mt:methods){
			System.out.println("����="+mt.getName()+"\n����="+mt.getReturnType()+"\n���η�="+soEasy(mt.getModifiers()));
			Class[] clazz=mt.getParameterTypes();
			if(clazz.length==0){
				System.out.println("�˷���û�в���");
			}
			for(Class cl:clazz){
				System.out.println("����"+cl.getName());
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
		return "Ĭ�����η�";
	}
}
