package ʮ����;

import java.util.Scanner;

public class User {
	Scanner input=new Scanner(System.in);
	String name;
	int score=0;
	int a;
	public void cq(){
		a=input.nextInt();
		switch(a){
		case 1:
			System.out.println("����ȭ:����");
			break;
			
		case 2:
			System.out.println("����ȭ��ʯͷ");
			break;
			
		case 3:
			System.out.println("����ȭ����");
			break;
		}
		
	}
}
