package com.cc.zy;

import com.cc.zy.Student01;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Student01 st=new Student01();
		//1.��ȡ����ֽ����ļ�����ʽһ��class.forName();//��ʹ����
		//Class<?> stuClazz=Class.forName("com.cc.zy.Student01");
		//System.out.println(stuClazz);
		//2.��ȡ����ֽ����ļ��Է�ʽ��������.class
		//Class stuClass4=Student01.class;//�ӳټ���
		//System.out.println(stuClass4.newInstance());
		//stuClass4.newInstance();
		//2.��ȡ����ֽ����ļ�����ʽ��������.getClass();
		Student01 s=new Student01();
		Class stuClazz2=s.getClass();
	}
}
