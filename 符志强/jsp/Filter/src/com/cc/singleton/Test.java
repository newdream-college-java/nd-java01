package com.cc.singleton;

/*
 * 怎么样让一个类只new出一个对象？  单列模式  
 * */
public class Test {
	public static void main(String[] args) {
		Student stu1 = Student.getStu();
		// hashcode 方法：返回是对象在内容中地址的整数形式
		System.out.println(stu1.hashCode());
		Student stu2 = Student.getStu();// 必须在方法中写成静态方法才能写两个
		System.out.println(stu2.hashCode());

		Student stu3 = Student.getStu();
		// Student stu2 = new Student();
		System.out.println(stu3.hashCode());
		
		Student stu4 = Student.getStu();
		// Student stu2 = new Student();
		System.out.println(stu4.hashCode());
	}
}
