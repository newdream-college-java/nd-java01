package ��ҵ;

import java.util.Scanner;

public class Pig {
	private  String name;
	private  int love;
	private  int health;
	private  String hair;
	public Pig(){
		
	}
	public Pig(String name){
		setName(name);
		
	}
	public void setHair(String hair){
		this.hair=hair;
	}
	public String getHair(){
		return hair;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
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
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("������ѡ�������ɫ��(1.��ɫ 2.��ɫ)");
		int a=input.nextInt();
		if(a==1){
			hair="��ɫ";
		}else{
			hair="��ɫ";
		}
		switch(a){
			case 1:
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������ε����ܶ���"+getLove()+"���ҵ�ë����ɫ�ǣ�"+getHair());
				break;
			case 2:
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������ε����ܶ���"+getLove()+"���ҵ�ë����ɫ�ǣ�"+getHair());
				break;
			default:
				break;
		}
	}
}
