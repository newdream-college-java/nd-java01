package ʮ����;

import java.util.Random;

public class Computer {
	Random rd=new Random();
	String name;
	int score=0;
	int a;
	public int cq(){
		a=rd.nextInt(3)+1;
		switch(a){
		case 1:
			System.out.println("���Գ�ȭ:����");
			break;
			
		case 2:
			System.out.println("���Գ�ȭ��ʯͷ");
			break;
			
		case 3:
			System.out.println("���Գ�ȭ����");
			break;
		}
		return a;
	}
}
