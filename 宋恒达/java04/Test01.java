/**
**ʹ��switchѡ��ṹʵ�ִӵ�¼�˵��л������˵����ܣ�
**��������1���������˵�
**��������2���Ƴ�����ʾ��лл����ʹ�á�
**�����������֣���ʾ���������
**/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t��¼�˵�����һ����");
		System.out.println("\t1.��¼ϵͳ");
		System.out.println("\t2.�˳�");
		System.out.println();
		System.out.print("\t��ѡ��˵�:");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("\t���˵����ڶ�����");
				System.out.println("\t1.�ͻ���Ϣ����");
				System.out.println("\t2.�������");
				System.out.println("\t3.�������");
				System.out.println("\t4.ע��");
				break;
			case 2:
				System.out.println("\tлл����ʹ�ã�");
				break;
			default:
				System.out.println("\t�������");
		}
	}
}