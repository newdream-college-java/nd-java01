import java.util.Scanner;
public class Hw04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//��ʾ����һ������
		System.out.print("������һ�����֣�");
		int num= input.nextInt();
		switch(num){
			case 1:
				System.out.print("����һ");
				break;
			case 2:
				System.out.print("���ڶ�");
				break;
			case 3:
				System.out.print("������");
				break;
			default:
				System.out.print("�������");
		}		
		
	}
}