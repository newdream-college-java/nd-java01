package ��ҵ;

public class Teacher {
	private String name;
	private char old;
	private int age;
	private String zy;
	private String fx;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getOld() {
		return old;
	}
	public void setOld(char old) {
		this.old = old;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public String getFx() {
		return fx;
	}
	public void setFx(String fx) {
		this.fx = fx;
	}
	static final String java="java����";
	static final String cs="����";
	static final String android="ANDROID";
	public Teacher(String name,int age){
		this.age=age;
		this.name=name;
		old='��';
		zy="�������";
		fx=java;
	}
	public Teacher(String name,char old,int age,String zy){
		this.zy=zy;
		this.name=name;
		this.age=age;
		this.old=old;
		this.fx=cs;
	}
	public void show(){
		System.out.println("�ҵ����ֽ�:"+getName()+"\n�Ա���:"+getOld()+"\n������:"+getAge()+"\nרҵ��:"+getZy()+"\n��������Ϊ:"+getFx());
	}
}
