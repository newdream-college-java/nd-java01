package ��ʮ������ҵ;

public class Syudent1 {
	private String name;
	private int age;
	public Syudent1(String name,int age){
		if(age<15){
			age=18;
		}
		System.out.println("��Һ��ҽ�:"+name+"�ҽ���"+age+"��");
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
	
}
