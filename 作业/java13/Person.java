package ��13����ҵ;

public class Person {
	String name;
	String sex;
	int age;
	public Person(String name,String sex,int age){
		//this ��ʾ��ǰ���е����� �ڶ���name��ʾ�����β�
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void show(){
		System.out.println("------------��Ա��Ϣ-----------");
		System.out.println("��Ա��Ϣ���£�\n����-->"+name+"\n�Ա�-->"+sex+"\n����-->"+age);
	}
}
