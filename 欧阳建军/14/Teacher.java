package ��14�·�װ��ҵ;

public class Teacher {
	String name;
	String sex;
	int age;
	String major;
	static final String major_JAVA="Java����";
	static final String major_TEST="Test����";
	static final String major_ANDROID="Android����";
	public Teacher(String name,int age){
		this.sex="��";
		this.major="�������";
		this.name=name;
		this.age=age;
	}
	public Teacher(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.major=major_TEST;
	}
	public void show(){
		System.out.println("����"+name+"\t�Ա�"+sex+"\t����"+age+"��"+"\t�ҵ��о�������"+major);
	}
	
}
