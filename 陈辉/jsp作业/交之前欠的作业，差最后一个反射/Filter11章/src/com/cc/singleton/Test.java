package com.cc.singleton;

/*
 * ��ô����һ����ֻnew��һ������  ����ģʽ  
 * */
public class Test {
	public static void main(String[] args) {
		Student stu1 = Student.getStu();
		// hashcode �����������Ƕ����������е�ַ��������ʽ
		System.out.println(stu1.hashCode());
		Student stu2 = Student.getStu();// �����ڷ�����д�ɾ�̬��������д����
		System.out.println(stu2.hashCode());

		Student stu3 = Student.getStu();
		// Student stu2 = new Student();
		System.out.println(stu3.hashCode());
		
		Student stu4 = Student.getStu();
		// Student stu2 = new Student();
		System.out.println(stu4.hashCode());
	}
}
