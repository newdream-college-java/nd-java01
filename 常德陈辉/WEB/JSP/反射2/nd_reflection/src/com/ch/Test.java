package com.ch;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
	public static void main(String[] args) throws Exception {
		Class cla=Class.forName("com.ch.A");
		//A a = (A) cla.newInstance();
		//�õ����е�����
		Field[] fields = cla.getDeclaredFields();
		//��˽����������Ҫ�����ƽ�
		Field.setAccessible(fields, true);
		for(int i=0;i<fields.length;i++){
			System.out.println(modifyToSrting(fields[i].getModifiers())+"--------"+fields[i].getType()+"-------"+fields[i].getName());
		}
		//������з��������������෽��
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
		
		return "Ĭ�����η�"+modify;
	}
	public static String parse(Class[] cs ){
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		for(int i=0;i<cs.length;i++){
			//��ȡclass�����Ӧ�����֣���:String.class-->String
			sb.append(cs[i].getSimpleName());
			//��������м��һ������
	        //���������һ���������治�Ӷ���
			if(i<cs.length-1){
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();
	}
}
