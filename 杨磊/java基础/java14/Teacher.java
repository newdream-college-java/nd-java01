package com.nd.zuoye.yl;

public class Teacher {
	private String name;
	private String sex;
	private int age;
	private String zhuan;
	
	
	public static final String JAVA = "java����";
	public static final String Test = "���Է���";
	public static final String ANDROID = "Android����";
	
	
	public Teacher(){
		
	}
	public Teacher(String name,int age){
		this.name = name;
		this.sex = "��";
		this.age = age;
		this.zhuan = "�������";
	}
	public Teacher(String name,String sex,int age,String zhuan){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.zhuan = zhuan;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getZhuan() {
		return zhuan;
	}
	public void setZhuan(String zhuan) {
		this.zhuan = zhuan;
	}
	
	
	
	public void print(){
		System.out.println(name+sex+age+zhuan);
	}
	
}
