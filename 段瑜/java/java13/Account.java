package ��ҵ;

import java.util.Scanner;

public class Account {
	int moneys;
	public int show(int money){
		Scanner input=new Scanner(System.in);
		moneys=money;
		return moneys;
		
	}
	public void show1(){
		System.out.println("1.���\t2.ȡ��\t0.�˳�");
		System.out.print("��ѡ������Ҫ�����ҵ��");
	}
	
}
