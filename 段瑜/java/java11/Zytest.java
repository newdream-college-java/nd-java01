package Zy;

import java.util.Scanner;

public class Zytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Zy a=new Zy();
		for(int i=1;i<=3;i++){
			a.showLoginmenu();
			a.score=input.nextInt();
			switch(a.score){
			case 1:
				System.out.println("�������û�����");
				String name=input.next();
				System.out.println("����������");
				a.score=input.nextInt();
				if(name.equals(a.names)||a.score==a.sum){
					a.showMainMenu();
					a.score=input.nextInt();
					switch(a.score){
					case 0:
						System.out.println("������һ��ҳ��");
						continue;
					case 1:
						
							a.showCustMenu();
							a.score=input.nextInt();
							switch(a.score){
								case 0:
									System.out.println("������һ��ҳ��");
									System.exit(-1);
								case 1:
									System.out.println("ִ�в�ѯ�ͻ���Ϣ");
									System.exit(-1);
								case 2:
									System.out.println("ִ���޸Ŀͻ���Ϣ");
									System.exit(-1);
								case 3:
									System.out.println("ִ����ӿͻ���Ϣ");
									System.exit(-1);
								case 4:
									System.out.println("ִ����ʾ���пͻ���Ϣ");
									System.exit(-1);
								default:
									System.out.println("�����������������");
									continue;
								}
							
						case 2:
							a.showCustMenu();
							a.score=input.nextInt();
							switch(a.score){
								case 0:
									System.out.println("������һ��ҳ��");
									continue;
								case 1:
									System.out.println("ִ�����˴�ת��");
									System.exit(-1);
								case 2:
									System.out.println("ִ�����˳齱");
									System.exit(-1);
								case 3:
									System.out.println("ִ�������ʺ�");
									System.exit(-1);
								default:
									System.out.println("�����������������");
									continue;
							}
						default:
							System.out.println("�����������������");
							continue;
							}
						}
					else{
						System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�½��@@");
						break;
					
					}
					case 2:
						System.out.println("�˳��������ع���ϵͳ");
						System.exit(-1);
					default:
						System.out.println("����������������룺");
						continue;
			}
		}
	}
}
