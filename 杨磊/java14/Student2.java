package com.nd.zuoye.yl;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String zhuan;
	
	
	public  Student2(){
		
	}
	public Student2(String name,int age){
		this.name = name;
		this.age = age;
		this.sex = "ÄÐ";
		this.zhuan = "Èí¼þ¹¤³Ì";
	}
	public Student2(String name,int age,String sex,String zhuan){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.zhuan = zhuan;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getZhuan() {
		return zhuan;
	}
	public void setZhuan(String zhuan) {
		this.zhuan = zhuan;
	}
	
	
	public void print(){
		System.out.println(name+age+sex+zhuan);
	}
}
