package ��ҵ;

import java.util.Scanner;

public class Penguin2 {
	private  String name;
	private  int love;
	private  int health;
	private  String sex;
	static String SEX_MALE="Q��";
	static String SEX_FEMALE="Q��";
	public Penguin2(){
		
	}
	public Penguin2(String name){
		setName(name);
		
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
	public void setSex(String sex){
		this.sex=sex;
	}
	public String  getSex(){		
		return sex;
	}
	
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("������ѡ�����Ա�(1.Q�� 2.Q��)");
		int a=input.nextInt();
		if(a==1){
			sex=SEX_MALE;
		}else{
			sex=SEX_FEMALE;
		}
		switch(a){
			case 1:
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������ε����ܶ���"+getLove()+"���Ա�"+getSex()+"������һֻ˧����Q��");
				break;
			case 2:
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������ε����ܶ���"+getLove()+"���Ա�"+getSex()+"������һֻ�ɰ���Q��");
				break;
			default:
				break;
		}
	}
	
}
