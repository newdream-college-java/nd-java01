package com.song;
/**
 * ����Person��ʹ��������췽���������ֱ����������Ա������
 * ʹ�ô������Ĺ���ʵ��������
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
		System.out.println("--------------��Ա��Ϣ---------------------------");
		System.out.println("��Ա��Ϣ����");
		System.out.println("����----->"+name+"\n�Ա�:----->"+sex+"\n����----->"+age);
	}
	public static void main(String[] args) {
		Person person=new Person("����","��",18);
		person.show();
	}
}
