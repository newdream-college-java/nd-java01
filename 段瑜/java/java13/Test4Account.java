package ��ҵ;

import java.util.Scanner;

public class Test4Account {
	private static final Object sum = null;

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Account a=new Account();
		int money=0;
		int sum;
		do{
		a.show1();
		sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("����������:");
				a.show(input.nextInt());
				money+=a.moneys;
				System.out.println("***��ǰ���Ϊ��"+money+"***");
				break;
			case 2:
				System.out.println("������ȡ����:");
				a.show(input.nextInt());
				money-=a.moneys;
				System.out.println("***��ǰ���Ϊ��"+money+"***");
				break;
			case 0:
				System.out.println("ллʹ�ã���");
				break;
			default:
				break;				
		}
		}while(sum!=0);
	}
}