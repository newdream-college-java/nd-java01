package com.cc.Test;

import com.cc.Student.Student;

public class Test2father {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//�õ�һ��������и���
	/*	Class clazz=Student.class;
		if(clazz!=null){
			System.out.println("����"+clazz.getName());
			System.out.println(1);
			clazz=clazz.getSuperclass();//������ǵõ����ĸ���
			System.out.println("����"+clazz);
		}
		Class[] cl=clazz.getInterfaces();
		for(int i=0;i<cl.length;i++){
			System.out.println(2);
			System.out.println("Object�ӿ�"+cl[i].getName());
		}
		System.out.println(3);
		System.out.println("Student����Ľӿ�"+clazz.getInterfaces());*/
		
		//��װ��ͻ������ͻ�ȡclass
		Class clazz=Integer.class;
		System.out.println(clazz);
	}
}















