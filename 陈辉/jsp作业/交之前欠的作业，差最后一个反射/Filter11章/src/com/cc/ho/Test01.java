package com.cc.ho;

import com.cc.po.Student;

public class Test01 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	//Student01 st=new Student01();
	//1.��ȡ����ֽ����ļ�����ʽһ��class.forName();//��ʹ����
	//Class<?> stuClazz=Class.forName("com.cc.ho.Student01");
	//System.out.println(stuClazz);
	//����class�ֽ��룬ʵ��������
	//Student01 stu=(Student01)stuClazz.newInstance();//newInstance��ʵ��(�����new��2��)
	//2.��ȡ����ֽ����ļ�����ʽ��������.getClass();
	//Student01 s=new Student01();
	//Class stuClazz2=s.getClass();//s.getClass()�õ�����class com.cc.ho.Student01
	//System.out.println(stuClazz2.newInstance());//com.cc.ho.Student01@dc8569�������ʲô
	//3.��ȡ����ֽ����ļ��Է�ʽ��������.class
	Class stuClass4=Student01.class;//�ӳټ���
	//System.out.println(stuClass4.newInstance());
	stuClass4.newInstance();
}
}
