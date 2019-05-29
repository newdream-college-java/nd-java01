package com.cc.entity;

public class Person {
	private int id;
	private String name;
	private int isMarried;
	private int age;
	
	public Person() {
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", idMarried="
				+ isMarried + ", age=" + age + "]\n";
	}
	public Person( String name, int isMarried, int age) {
		super();
		this.name = name;
		this.isMarried = isMarried;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIsMarried() {
		return isMarried;
	}
	public void setIsMarried(int isMarried) {
		this.isMarried = isMarried;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
