package com.cc.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test01 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static String soEasy(int modifier){
	    return Modifier.toString(modifier);
	}
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.cc.test.A");
		A a=(A) c.newInstance();
		
		Field[] fields =c.getDeclaredFields();
		for(Field ff:fields){
			System.out.println(soEasy(ff.getModifiers())+"\t"+
                    ff.getType().getSimpleName()+"\t"+
                    ff.getName());
		}
		
	}
	
}
