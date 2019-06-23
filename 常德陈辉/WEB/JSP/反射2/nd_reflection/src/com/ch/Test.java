package com.ch;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
	public static void main(String[] args) throws Exception {
		Class cla=Class.forName("com.ch.A");
		//A a = (A) cla.newInstance();
		//得到所有的属性
		Field[] fields = cla.getDeclaredFields();
		//有私有属性所以要暴力破解
		Field.setAccessible(fields, true);
		for(int i=0;i<fields.length;i++){
			System.out.println(modifyToSrting(fields[i].getModifiers())+"--------"+fields[i].getType()+"-------"+fields[i].getName());
		}
		//获得所有方法，不包括父类方法
		Method[] methods = cla.getMethods();
		for(Method method: methods){
			System.out.println(modifyToSrting(method.getModifiers())+"---"+method.getReturnType().getSimpleName()+"---"+parse(method.getParameterTypes()));
		}
	}
	public static String modifyToSrting(int modify){
		if(modify==Modifier.PUBLIC){
			return "public";
		}else if(modify==Modifier.PRIVATE){
			return "private";
		}else if(modify==Modifier.PROTECTED){
			return "protected";
		}
		
		return "默认修饰符"+modify;
	}
	public static String parse(Class[] cs ){
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		for(int i=0;i<cs.length;i++){
			//获取class对象对应的名字，如:String.class-->String
			sb.append(cs[i].getSimpleName());
			//多个参数中间加一个逗号
	        //条件是最后一个参数后面不加逗号
			if(i<cs.length-1){
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();
	}
}
