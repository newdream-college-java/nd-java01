package ��ҵ;

import java.util.Scanner;

public class Zylei2 {
	Scanner input=new Scanner(System.in);
	private String name;
	private int health=100;
	private int love=80;
	private String strain="̩����";
	
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

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public void print(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("��ѡ�񹷹�Ʒ�֣���1.̩�� 2.�������ࣩ");
			int p=input.nextInt();
			if (p==1) {
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ������̩��Ȯ");
				f=true;
			}else
			if (p==2) {
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ��������������Ȯ");
				f=true;
			}else{
				System.out.println("�����������������");
				System.out.println("��ѡ�񹷹�Ʒ�֣���1.̩�� 2.�������ࣩ");
				p=input.nextInt();
			}
		}
		
		
	}
}
