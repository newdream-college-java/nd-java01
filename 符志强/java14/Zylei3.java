package ��ҵ;

import java.util.Scanner;

public class Zylei3 {
	public static final String SEX_MALEL = "��";
	public static final String SEX_FEMALE = "ĸ";
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
	public Zylei3(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("��ѡ�񹷹�Ʒ�֣���1.̩�� 2.�������ࣩ");
			int p=input.nextInt();
			if (p==1) {
				System.out.print("�����빷�����Ա𣺣�1.�� ����.ĸ��");
				String sex;
				
				if (input.nextInt()==1) {
					sex=SEX_MALEL;
					
				}else{
					sex=SEX_FEMALE;
			
				}
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+"�ҵ��Ա���"+sex+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ������̩��Ȯ");
				f=true;
			}else
			if (p==2) {
				System.out.print("�����빷�����Ա𣺣�1.�� ����.ĸ��");
				String sex;
				
				if (input.nextInt()==1) {
					sex=SEX_MALEL;
					
				}else{
					sex=SEX_FEMALE;
			
				}
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+"�ҵ��Ա���"+sex+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ��������������Ȯ");
				f=true;
			}else{
				System.out.println("�����������������");
				System.out.println("��ѡ�񹷹�Ʒ�֣���1.̩�� 2.�������ࣩ");
				p=input.nextInt();
			}
	}
	
		
		
	}
}
