package com.cc.zy;

public class Student01 {
	private String name;
	private int age;

	public Student01() {
		System.out.println("Student01���������...");
	}

	static {
		System.out.println("����Student01�ľ�̬��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		new Student01();
	}
}
