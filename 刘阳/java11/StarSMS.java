import java.util.Scanner;


public class StarSMS {
	String name;
	String code;
	//���趨�õ�¼ҳ�����ʾ
	public void showLoginMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t1.��¼ϵͳ"+"\n\t\t2.�˳�");
		System.out.println("******************************");
		//��ʾ����
		System.out.print("��ѡ���������֣�");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				showLogin();
				break;
			case 2:
				//��ʾ�˳�
				System.out.println("�Ѿ��˳�����ӭ�´�������");
				System.exit(-1);
			default:
				System.out.println("��ѡ����֧�ֵĹ��ܣ�лл��");
				showLoginMenu();
		}
	}
	public void showLogin(){
		Scanner input=new Scanner(System.in);
		//�����û���
		System.out.println("�������û�����");
		name=input.next();
		System.out.println("���������룺");
		code=input.next();
		if(name.equals(this.name)&&code.equals(this.code)){
			System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�½��@@");
		}
	}
}
