package �˻���ȭ2;

import java.util.Scanner;


public class Game {
	//�˶���Ĵ���
Person p=new Person();
	//���Զ���Ĵ���
Computer c =new Computer();
String roleName;
int sum=0;
String a;

public void initial(){
	Scanner input = new Scanner(System.in);
	System.out.println("-------------------------��ӭ������Ϸ����-------------------\n\n");
	System.out.println("**********************");
	System.out.println("**\t��ȭ����ʼ\t**");
	System.out.println("*****************************\n\n");
	System.out.println("��ȭ����1.����2.ʯͷ3.��");
	System.out.println("�������������");
	p.name=input.next();
	role();
}
public void gameStart(){
	Scanner input =new Scanner(System.in);
	System.out.println("�Ƿ������Ϸ(y/n)");
	String a = input.next();
	while(a.equals("y")){
		compare();
		sum++;
		System.out.println("�Ƿ������Ϸ(y/n)");
		a = input.next();
		/*
		 	do{
		System.out.println("�Ƿ������Ϸ(y/n)");
		a =input.next();
		compare();
		sum++;
		
	}while(a.equals("y"));

		 */
	}
	show();
	
}
public void role(){
	Scanner input = new Scanner(System.in);
	System.out.println("��ѡ�������ս�Ľ�ɫ1.����\t2.��Ȩ\t3.�ܲ�");
	int crole = input.nextInt();
	switch(crole){
		case 1:
			System.out.println("����");
			roleName="����";
			break;
		case 2:
			System.out.println("��Ȩ");
			 roleName="��Ȩ";
			break;
		case 3:
			System.out.println("�ܲ�");
			 roleName="�ܲ�";
			break;
	}
	gameStart();
}
public void compare(){
	 /*
	   		P		c			result
	   		1		1		p-c=0		ƽ
	   		1		2		p-c=-1		cӮ
	   		1		3		p-c=-2		pӮ
	   		2		1		p-c=1		pӮ
	   		2		2		p-c=0		ƽ
	   		2		3		p-c=-1		cӮ
	   		3		1		p-c=2		cӮ
	   		3		2		p-c=1		pӮ
	   		3		3			0		ƽ
	  */
	p.fun();
	c.fun();
	if(p.chuQuan-c.chuQuan==-1){
		System.out.println("������");
		c.score++;
	
	}else if(p.chuQuan==c.chuQuan){
		System.out.println("ƽ��");
	}else{
		System.out.println("��Ӯ��");
		p.score++;
	}

}
public void show(){
	System.out.println(p.name+"VS"+roleName);
	System.out.println("��ս����"+sum+"\n");
	System.out.println("����\t"+"�÷�");
	System.out.println(p.name+"\t"+p.score);
	System.out.println(roleName+"\t"+c.score);
	result();
}
public void result(){
	if(p.score>c.score){
		System.out.println("\n\n��ϲ��ϲ");
	}else if(p.score==c.score){
		System.out.println("\n\nƽ��");
	}else{
		System.out.println("\n\n�����ˣ���ô�������Զ��򲻹�");
	}
	
}
}
