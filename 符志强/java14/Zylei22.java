package ��ҵ;

import java.util.Scanner;

public class Zylei22 {
	Scanner input=new Scanner(System.in);
	private String name;
	private int health=100;
	private int love=80;
	private String sex="��";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("��ѡ�����Ʒ�֣���1.�ϼ� 2.������");
			int p=input.nextInt();
			if (p==1) {
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ�������ϼ����");
				f=true;
			}else
			if (p==2) {
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ�����ĵ������");
				f=true;
			}else{
				System.out.println("�����������������");
				System.out.println("��ѡ�����Ʒ�֣���1.�ϼ� 2.������");
				p=input.nextInt();
			}
		}
	}	
}
