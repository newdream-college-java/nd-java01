import java.util.Scanner;
public class Hw10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t��ӭʹ��MyShopping����ϵͳ"+"\n"+"*******************************"+"\n\t\t"+"1.�ͻ���Ϣ����"+"\n\t\t"+"2.�������"+"\n\t\t"+"3.�������"+"\n\t\t"+"4.ע��");
		//��ʾ������Ӧģ��
		System.out.println("������������Ҫ�ķ�������ֺ��루��������Ŷ������");
		int num=input.nextInt();
		while(num!=1&&num!=2&&num!=3&&num!=4){
			System.out.println("��������������������֣�");
			num=input.nextInt();
		}
		switch(num){
			case 1:
				System.out.print("�ѽ���ͻ���Ϣ����ҳ��");
				break;
			case 2:
				System.out.print("ִ�й������");
				break;
			case 3:
				System.out.print("��ӭ�����������");
				break;
			case 4:
				System.out.print("��ע��");
				
			default:
		}
	}
}