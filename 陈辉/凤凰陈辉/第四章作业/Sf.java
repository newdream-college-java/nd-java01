import java.util.Scanner;
public class Sf{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("����һ����");
	int a =input.nextInt();
	switch(a){
		case 1:
		System.out.println("��������һ");
		break;
		case 2:
		System.out.println("�������ڶ�");
		break;
		case 3:
		System.out.println("����������");
		break;
		default:
		System.out.println("������ʾ����");

		}
	}

}