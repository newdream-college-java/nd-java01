package �������ϵͳ;

import java.util.Scanner;

public class MotoVehicle {
	private  int type;	
	private  int money;
	private  int day;
	public void setType(int type){
		this.type=type;
		
	}
	public void setDay(int day){
		this.day=day;
	}
	public int getDay(){
		return day;
	}
	public void setMoney(int money){
		this.money=money;
	}
	public int getMoney(){
		return money;
	}
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.print("��������Ҫ���޶����죺");
		day=input.nextInt();
	}
	public void show4(){
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ���޵��������ͣ�1.�γ� 2.�ͳ�����");
		setType(input.nextInt());
	}
	
}
