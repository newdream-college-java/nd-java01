package ��14�·�װ��ҵ;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String major;
	public Student2(String name,int age){
		sex="��";
		major="�������";
		System.out.println("���õ����������Ĺ��췽��");
	}
	public Student2(String name,int age,String sex,String major){
		System.out.println("���õ���������Ĺ��췽��");
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void showMyself(){
		System.out.println("����"+getName()+"������"+getAge()+"����"+"�ҵ�רҵ��"+getMajor()+",����"+getClass()+"�ࡣ");
	}
}
