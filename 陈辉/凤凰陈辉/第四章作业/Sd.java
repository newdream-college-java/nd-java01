import java.util.Scanner;
public class Sd{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("��ѩ�μӼ������̴���");
		int je =input.nextInt();
		switch(je){
			case 0:
			System.out.println("���򲻸�����");
			break;
			case 1:
			System.out.println("���μ�����ѧ��֯��1��������Ӫ");
			break;
			case 2:
			System.out.println("�������ձʼǱ�����һ��");
			break;
			case 3:
			System.out.println("�������ƶ�Ӳ��һ��");
			break;
			default:
			System.out.println("���򣬲�������");
		} 
	}

}