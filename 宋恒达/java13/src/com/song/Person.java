package com.song;
/**
 * 创建Person类和带参数构造方法，参数分别是姓名，性别和年龄
 * 使用带参数的构造实例化对象
 * @author mo
 *
 */
public class Person {
	private String name;
	private String sex;
	private int age;
	
	public Person() {

	}

	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void show() {
		System.out.println("--------------人员信息---------------------------");
		System.out.println("人员信息如下");
		System.out.println("姓名----->"+name+"\n性别:----->"+sex+"\n年龄----->"+age);
	}
	public static void main(String[] args) {
		Person person=new Person("张三","男",18);
		person.show();
	}
}
