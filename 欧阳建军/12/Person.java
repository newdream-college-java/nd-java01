package �˻���ȭ2;

import java.util.Scanner;

public class Person {
String name="����";
int score;
int chuQuan=-1;
public void fun(){
	Scanner input =new Scanner(System.in);
	System.out.println("���ȭ");
	chuQuan =input.nextInt();
	
	switch(chuQuan){
	case 1:
		System.out.println("�˳��ļ���");
		break;
	case 2:
		System.out.println("�˳���ʯͷ");
		break;
	case 3:
		System.out.println("�˳��Ĳ�");
		break;
}
}
}
