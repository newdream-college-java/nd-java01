package com.cc.test;

import java.lang.reflect.Field;

public class ReflectionUtils {
	public static String getMethod(String fieldName, Object object){
        try {
            Field field = object.getClass().getField(fieldName);
            //设置对象的访问权限，保证对private的属性的访问
            return  (String)field.get(object);
        } catch (Exception e) {
            return null;
        } 
    }
	public static void main(String[] args) {
		A ab=new A();
		System.out.println();getMethod("a",ab);
	}
}
