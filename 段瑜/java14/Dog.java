package ��ҵ;


import java.util.Scanner;



public class Dog {
	private  String name;
	private  int love;
	private  int health;
	private  String strain;
	public void setNames(String name){
		this.name=name;
	}
	public String getNames(){
		return name;
	}
	public void setHealth(int health){
		this.health=health;
	}
	public int getHealth(){
		return health;
	}
	public void setLove(int love){
		this.love=love;		
	}
	public int getLove(){
		return love;
	}
	public void setStrain1(){
		String strain="����һֻ��������������";
		this.strain=strain;
	}
	public String  getStrain1(){		
		return strain;
	}
	public void setStrain2(){
		String strain="����һֻ����ѩ����";
		this.strain=strain;
	}
	public String getStrain2(){
		return strain;
	}
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("������ѡ�񹷹���Ʒ�֣�(1.�������� 2.ѩ����)");
		int a=input.nextInt();
		switch(a){
			case 1:
				setStrain1();
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getNames()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"��"+getStrain1());
				break;
			case 2:
				setStrain2();
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getNames()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"��"+getStrain2());
				break;
			default:
				break;
		}
	}
}
