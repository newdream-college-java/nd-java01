import java.util.Scanner;
public class Zy1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ�����������ع������ϵͳ");
		System.out.println("1.��¼ϵͳ");
		System.out.println("2.�˳�\n");
		System.out.println("*******************************************************");	
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("1.�ͻ���Ϣ����\n2.�������\n3.�������\n4.ע��");
				System.out.print("��ѡ���������֣�");
				int b=input.nextInt();
				switch(b){
					case 1:
						System.out.println("1.��ʾ���пͻ���Ϣ");
						System.out.println("2.��ӿͻ���Ϣ");
						System.out.println("3.�޸Ŀͻ���Ϣ");
						System.out.println("4.��ѯ�ͻ���Ϣ");
						break;
					case 2:
						System.out.println("�����ڴ�");
						break;
					case 3:
						System.out.println("1.���˴����");
						System.out.println("2.���˳齱");
						System.out.println("3.�����ʺ�");
						break;
					case 4:
						System.out.println("лл����ʹ��");
						break;
					default:
						System.out.println("�������");
						break;

				}
				break;
			case 2:
				System.out.println("лл����ʹ��");
				break;
			default:
				System.out.println("�������");
				break;
		}
	}

}