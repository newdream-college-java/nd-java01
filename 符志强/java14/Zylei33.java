package ��ҵ;

import java.util.Scanner;

public class Zylei33 {
	public static final String SEX_MALEL = "Q��";
	public static final String SEX_FEMALE = "Q��";
	Scanner input=new Scanner(System.in);
	private String name;
	private int health=100;
	private int love=80;
	private String sex;
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
	public Zylei33(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("��ѡ�����Ʒ�֣���1.�ϼ� 2.������");
			int p=input.nextInt();
			if (p==1) {
				System.out.print("�����������Ա𣺣�1.Q�� ����.Q�ã�");
				String sex;
				if (input.nextInt()==1) {
					sex=SEX_MALEL;
				}else{
					sex=SEX_FEMALE;
				}
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+"�ҵ��Ա���"+sex+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ�������ϼ����");
				f=true;
			}else
			if (p==2) {
				System.out.print("�����������Ա𣺣�1.Q�� ����.Q�ã�");
				String sex;
				if (input.nextInt()==1) {
					sex=SEX_MALEL;
				}else{
					sex=SEX_FEMALE;
				}
				System.out.println("�����԰ף�");
				System.out.println("�ҵ����ֽ�"+name+"�ҵ��Ա���"+sex+",����ֵΪ"+health+",�����˵����ܶ�Ϊ"+love+"����һֻ�����ĵ������");
				f=true;
			}else{
				System.out.println("�����������������");
				System.out.println("��ѡ�����Ʒ�֣���1.�ϼ� 2.������");
				p=input.nextInt();
			}
		}
	}

}
