import java.util.Scanner;
public class Menu {
	public void showLoingMenu(){
		StartSMS sms=new StartSMS();
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("\t1.��¼ϵͳ");
		System.out.println("\t2.�˳�");
		System.out.println("******************************");
		System.out.print("��ѡ���������֣�");
		int login=input.nextInt();
		if(login==1){
			sms.show();
		}else{
			System.out.print("��л����ʹ��");
		}
		
	}
	public void showMainMenu(){
		Scanner a=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ");
		System.out.println("\t1.�ͻ�����ϵͳ");
		System.out.println("\t2.�������");
		System.out.println("******************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int main=a.nextInt();
		if(main==0){
			showLoingMenu();
		}else if(main==1){
			showCustMenu();
		}else if(main==2){
			showSendMenu();
		}else{
			System.out.print("�������,����������");
			showMainMenu();
		}
		
	}
	public void showCustMenu(){
		Scanner b=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����");
		System.out.println("\t1.��ѯ�ͻ���Ϣ");
		System.out.println("\t2.�޸Ŀͻ���Ϣ");
		System.out.println("\t3.��ӿͻ���Ϣ");
		System.out.println("\t2.��ʾ���пͻ���Ϣ");
		System.out.println("******************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int cust=b.nextInt();
		if(cust==0){
			showMainMenu();
		
		}else{
			System.out.print("�������,����������");
			showCustMenu();
		}
	}
	public void showSendMenu(){
		Scanner c=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�������");
		System.out.println("\t1.���˴����");
		System.out.println("\t2.���˳齱");
		System.out.println("\t3.�����ʺ�");
		System.out.println("******************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int send=c.nextInt();
		if(send==0){
			showMainMenu();
		
		}else{
			System.out.print("�������,����������");
			showSendMenu();
		}
	}
}
