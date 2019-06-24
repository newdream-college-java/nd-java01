package com.cc.singleton;

public class Student {
	// 解决线程安全问题
	/*
	 * public static Student stu;//返回给调用者的唯一对象？？？ private
	 * Student(){//构造方法(把构造方法变成私有的就只能调用一次)
	 * 
	 * } //把方法变成私有的 public static Student getStu(){//把方法变成静态的方法 if(stu==null){
	 * stu=new Student(); } return stu; }
	 */

	// 解决线程安全问题--加锁
	private static int count = 0;
	private static Student stu;// 返回给调用者的唯一对象？？？

	private Student() {
	}

	public static Student getStu() {
		System.out.println(1);
			if (count<3) {
			synchronized (stu) {
				count++;
				stu=new Student();
				return stu;
				//count++;
			
			//count++;
			}
			}
			
		return null;
		//count++;
		
	}

	
}
