package zuoye;

import java.util.Scanner;

public class Menu {
	Scanner input=new Scanner(System.in);
	public void showLoginMenu(){
		StartSMS d =new StartSMS();
		System.out.println("��ӭʹ���������ع������ϵͳ\n\t1.��¼ϵͳ\n\t2.�˳�");
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		if(a==1){
			d.pan();
		}else{
			System.out.println("��ӭ�����һ��ʹ�ã��ټ���");
			System.exit(0);
		}		
	}
	public void showMainMenu(){
		System.out.println("��ӭʹ���������ع������ϵͳ\n\t1.�ͻ���Ϣ����\n\t2.�������");
		System.out.println("��ѡ���������ֻ�0������һ��˵�:");
		int b=input.nextInt();
		if(b==1){
			showCustMenu();
		}else if(b==2){
			showSendMenu();
		}else if(b==0){
			showLoginMenu();
		}else{
			System.out.println("Ϲ����������ˣ�");
		}
	}
	public void showCustMenu(){
		System.exit(0);
	}
	public void showSendMenu(){
		System.out.println("�������ع������ϵͳ���������\n\t1.���˴����\n\t2.���˳齱\n\t3.�����ʺ�");
		System.out.println("��ѡ���������ֻ�0������һ��˵�:");
		int c=input.nextInt();
		if(c==0){
			showMainMenu();
		}
	}
	
}
