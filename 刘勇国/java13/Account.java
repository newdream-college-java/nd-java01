package ��13����ҵ;

import java.util.Scanner;

public class Account {
	Scanner input =new Scanner(System.in);
	int money=0;
	public void menu(){
		System.out.println("1.���2.ȡ��0.�˳�");
		System.out.print("��ѡ������Ҫ�����ҵ��");
		int chioce =input.nextInt();
		if(chioce==1){
			System.out.print("���������");
			cunKuan(input.nextInt());
			System.out.println("���ɹ�");
			show();
		}else if(chioce==2){
			System.out.print("������ȡ���");
			quKuan(input.nextInt());
			System.out.println("ȡ��ɹ�\n");
			show();
		}else{
			System.out.print("ллʹ��!");
			System.exit(-1);
		}
	}
	public void cunKuan(int money){
		this.money+=money;
		
	}
	public void quKuan(int money){
		if(this.money-money>=0){
			this.money-=money;
		}else{
			System.out.println("�������������˵�");
			menu();
		}
	}
	public void show(){
		System.out.println("***��ǰ���Ϊ��"+money*1.0+"Ԫ*****\n");
		
	}
}
