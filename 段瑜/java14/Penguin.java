package ��ҵ;


import java.util.Scanner;

public class Penguin {
	private  String name;
	private  int love;
	private  int health;
	private  String sex;
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
	public void setSex1(){
		String sex="����һֻ˧����Q��";
		this.sex=sex;
	}
	public String  getSex1(){		
		return sex;
	}
	public void setSex2(){
		String sex="����һֻ�ɰ���Q��";
		this.sex=sex;
	}
	public String getSex2(){
		return sex;
	}
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("������ѡ�񹷹���Ʒ�֣�(1.Q�� 2.Q��)");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getNames()+"������ֵ��"+getHealth()+"�������ε����ܶ���"+getLove()+"��"+getSex1());
				break;
			case 2:
				System.out.println("������԰ף�\n�ҵ����ֽ�"+getNames()+"������ֵ��"+getHealth()+"�������ε����ܶ���"+getLove()+"��"+getSex2());
				break;
			default:
				break;
		}
	}
	
}
