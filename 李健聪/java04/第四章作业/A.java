//�������ifǶ�����дһ��
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("\t��½�˵�(��һ��)\n"+"1.��¼ϵͳ\n"+"\t2.�˳�\n");	
		System.out.println("��������Ӧ������");
		int a=input.nextInt();
		switch(a){
			case 1:
			System.out.println("1.�ͻ���Ϣ����");
			System.out.println("2.�������");
			System.out.println("3.�������");
			System.out.println("4.ע��");
			int b=input.nextInt();
			switch(b){
				case 1:
				System.out.println("�������ϵͳ>�ͻ���Ϣ����");
				System.out.println("\t1.��ʾ���пͻ���Ϣ\n"+"\t2.��ӿͻ���Ϣ\n"+"\t3.�޸Ŀͻ���Ϣ\n"+"\t4.��ѯ�ͻ���Ϣ\n");
				System.out.print("������1~4Ҫִ�еĲ���");
				int c=input.nextInt();
					switch(c){
						case 1:
						System.out.println("������˼��ʱ��������û������");
						System.exit(-1);
						case 2:
						System.out.println("������˼,������ʱ��������û������");
						System.exit(-1);
						case 3:
						System.out.println("������˼������ʱ��������û������");
						System.exit(-1);
					}		
				case 2:
				System.out.println("������˼��ʱ��������û������");
				System.exit(-1);
				case 3:
				System.out.println("������˼,������ʱ��������û������");
				System.exit(-1);
				case 4:
				System.out.println("������˼������ʱ��������û������");
				System.exit(-1);
			}
				
			case 2:
			System.out.print("лл����ʹ��");
			System.exit(-1);
			default:
			System.out.print("�������");
		}
	}
}