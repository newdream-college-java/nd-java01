package com.dy.reflection;

import java.util.HashMap;

public class test1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//��һ��
		Class<?> hashCla=Class.forName("java.util.HashMap");
		HashMap has=(HashMap) hashCla.newInstance();
		System.out.println(has);
		//�ڶ���
		HashMap h=new HashMap();
		Class has2=h.getClass();
		System.out.println(has2.newInstance());
		//������
		Class HashM=Class.forName("java.util.HashMap");
		System.out.println(HashM);
		
	}
}
