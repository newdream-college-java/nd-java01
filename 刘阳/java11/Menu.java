import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class Menu {
	//չʾ��¼�˵�ҳ��
	public void showLoginMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t1. ��¼ϵͳ"+"\n"+"\t\t2. �˳�\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ���������֣�");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				showMainMenu();
				break;
			case 2:
				//��ʾ�˳��˳���
				System.out.println("�����˳�ϵͳ");
				break;
		}
	}
	//չ���༭���˵�ҳ��
	public void showMainMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t�������ع������ϵͳ���˵�\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1. �ͻ���Ϣ����"+"\n"+"\t\t2. �������\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				showCustMenu();
				break;
			case 2:
				showSendMenu();
				break;
			case 0:
				showLoginMenu();
				break;
		}
	}
	//չ���༭�ͻ���Ϣ����ҳ��
	public void showCustMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t�������ع������ϵͳ���˵�\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1. ��ѯ�ͻ���Ϣ"+"\n"+"\t\t2. �޸Ŀͻ���Ϣ\n"+"\t\t3. ��ӿͻ���Ϣ\n"+"\t\t4. ��ʾ���пͻ���Ϣ\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				System.out.println("��ӭ�����ѯ�ͻ���Ϣ");
				break;
			case 2:
				System.out.println("��ӭ�����޸Ŀͻ���Ϣ");
				break;
			case 3:
				System.out.println("��ӭ������ӿͻ���Ϣ");
				break;
			case 4:
				System.out.println("��ӭ������ʾ���пͻ���Ϣ");
				break;
			case 0:
				showMainMenu();
				break;
		}
	}
	//չ���༭�������ҳ��
	public void showSendMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t�������ع������ϵͳ> �������\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1. ���˴����"+"\n"+"\t\t2. ���˳齱\n"+"\t\t2. �����ʺ�\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				System.out.println("ִ�����˴����");
				break;
			case 2:
				System.out.println("ִ�����˳齱");
				break;
			case 3:
				System.out.println("ִ�������ʺ�");
				break;
			case 0:
				showMainMenu();
				break;
		}
	}
}
