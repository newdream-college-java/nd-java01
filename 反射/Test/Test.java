package com.cc.Test;

import com.cc.Student.Student;

public class Test {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	/*  ��̬���룺javaԴ�ļ�---javac����(��̬����)----.class�ļ�---����
      ��̬���룺���Ƿ��䡣
      ��Person.java  Student.java ----javac------- Person.class Student.class�� 
       ��Person.java  Stduent.java -----��̬����(��Ҫ��person Person.class)��----���
       a.txt-----File file  =new File("a.txt")
       Person.class----Class�����
       
       Class�ࣺjavaԴ�ļ�����������һ��������.class�ļ���Class�����Ϳ�������һ��.class�ļ�
       .class�ļ��а�������Щ������ ����Ϣ�����ԣ�����.....
       Class������а�����.class�ļ���������Ϣ��*/
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		////1.��ȡ����ֽ����ļ�����ʽһ��Class.forName();    .class�ļ���������Ϣ��ȫ�޶����� ���� ���� ���췽��
		Class<?> st = Class.forName("com.cc.Student.Student");
		//System.out.println(st);
		//Student st1 = (Student) st.newInstance();
		
		//2.��ȡ����ֽ����ļ�����ʽ��������getClass
//		Student s=new Student();
//		Class stu=s.getClass();
//		System.out.println(stu);
		
		//3.��ȡ����ֽ����ļ�����ʽ��������.class���ַ�ʽ������
		//Class st=Student.class;
		
		//3.��ȡ����ֽ����ļ�����ʽ������ʽ���뷽ʽһ������
//		Class<?> st=Class.forName("com.cc.Student.Student");//��ʱ���� ���ǲ�new����
//		System.out.println("-----------");
//		
//		Class st1=Student.class;
//		System.out.println(st1);
//		Student s1=(Student) st1.newInstance();//���new���� ִ�й��췽�������Ĳ�ִ��
		
	}

}
