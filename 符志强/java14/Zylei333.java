package ��ҵ;

import java.util.Scanner;

public class Zylei333 {
	public static final String COLOR_MALEL = "��ɫ";
	public static final String COLOR_FEMALE = "��ɫ";
	Scanner input=new Scanner(System.in);
	private String name;
	private int health=100;
	private int love=80;
	//private String color="��ɫ";
	
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

//	public String getStrain() {
//		return color;
//	}
//
//	public void setStrain(String strain) {
//		this.color = strain;
//	}
	public Zylei333(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("��ѡ������Ʒ�֣���1.������ 2.����С��");
			int p=input.nextInt();
			if (p==1) {
				System.out.print("��ѡ���������ɫ����1.��ɫ    ����.��ɫ��");
				String color=null;
				if (input.nextInt()==1) {
					color=COLOR_MALEL;
				}else{
					color=COLOR_FEMALE;
				}
				
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+"�ҵ���ɫ��"+color+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"��ֻ�Ĵ����ĳ�����");
				f=true;
			}else
			if (p==2) {
				System.out.print("��ѡ���������ɫ����1.��ɫ    ����.��ɫ��");
				String color=null;
				if (input.nextInt()==1) {
					color=COLOR_MALEL;
				}else{
					color=COLOR_FEMALE;
				}
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+"�ҵ���ɫ��"+color+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"��ֻ�Ĵ���������С��");
				f=true;//+"����һֻ"+color+
			}else{
				System.out.println("�����������������");
				System.out.println("��ѡ������Ʒ�֣���1.������ 2.����С��");
				p=input.nextInt();
			}
	}
	
		
		
	}
}
