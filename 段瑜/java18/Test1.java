package ��ҵ;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		try{
			System.out.print("������γ̴��ţ�1~3֮������֣���");
			int a=input.nextInt();
			switch(a){
				case 1:
					System.out.println("C#���");
					break;
				case 2:
					System.out.println("JAVA���");
					break;
				case 3:
					System.out.println("SQL����");
					break;
				default:
					System.out.println("�������");
					break;
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("��ӭ�������");
		}
	}
}
