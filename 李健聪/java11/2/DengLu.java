package shiyizhang;

import java.util.Scanner;

public class DengLu {
	
	/**
	 * @param args
	 */
	
		Scanner input=new Scanner(System.in);
		public void showLoginMenu(){
			System.out.println("��ӭʹ���������ع������ϵͳ\n");
			System.out.println("\t1.��¼ϵͳ\n");
			System.out.println("\t2.�˳�");
			System.out.println("*************************");
			System.out.println("��ѡ��,��������:");
			int a=input.nextInt();
			if(a==1){
				showMainMenu();
			}
			else{
				System.exit(-1);
			}
		}
		public void showMainMenu(){
			System.out.println("�������ع������ϵͳ������\n");
			System.out.println("\t1.�ͻ���Ϣ����\n");
			System.out.println("\t2.�������");
			System.out.println("*************************");
			System.out.println("��ѡ��,�������ֻ�0������һ���˵�");
			int a=input.nextInt();
			if(a==1){
				StartSmS();
			}
			else{
				if(a==2){
					showSendGMenu();
				}
			}
		}
	
		public void StartSmS(){
			System.out.println("��ӭ�����û���½ϵͳ");
			System.out.print("�������û�����");
			String a=input.next();
			System.out.print("���������룺");
			int b=input.nextInt();
			if(a.equals("abcde")&&b==123456){
				System.out.println("@@��ɹ������½����@@");
				System.out.println("�����û���Ϊ:"+a);
				System.out.println("��������Ϊ��"+b);
				showSendGMenu();
			}else{
				System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼��@@");
				StartSmS();
			}
			
		}
		public void showSendGMenu(){
			System.out.println("�������ع������ϵͳ>�������\n");
			System.out.println("*************************");
			System.out.println("1.���˴����\n");
			System.out.println("2.���˳齱\n");
			System.out.println("3.�����ʺ�\n");
			System.out.println("*************************");
			System.out.println("��ѡ��,�������ֻ�0������һ���˵�");
			int a=input.nextInt();
			if(a==1||a==2||a==3){
				System.out.println("�����������ʱ���㲻����,����������");
				showSendGMenu();
			}
			else if(a==0){
				showMainMenu();
			}
		}
	
}