import java.util.Random;
import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		int i=1;
		while(i!=0){
			int sum=rd.nextInt(2);
			System.out.println("������ʯͷ��������");
			int a=input.nextInt();
			i++;
			switch(a){
				case 0:
					System.out.println("ʯͷ");
					break;
				case 1:
					System.out.println("����");
					break;
				case 2:
					System.out.println("��");
					break;
				default:
					i=0;
					break;
			}
			switch(sum){
				case 0:
					System.out.println("ʯͷ");
					break;
				case 1:
					System.out.println("����");
					break;
				case 2:
					System.out.println("��");
					break;
				default:
					i=0;
					break;
			}
		}
		System.out.println("�������");
	}
}