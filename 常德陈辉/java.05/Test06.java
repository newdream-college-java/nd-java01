/*���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ��*/
import java.util.Random;
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	Random rd=new Random();
	System.out.print("������0��2֮���һ������");
	int n=input.nextInt();
	int i;
	for(i=n;i<3;i=n){
		switch(n){
			case 0:
				System.out.print("�������ʯͷ\t");
				break;
			case 1:
				System.out.print("������Ǽ���\t");
				break;
			case 2:
				System.out.print("������ǲ�\t");
				break;
			}
		int a=rd.nextInt(3);
		switch(a){
			case 0:
				System.out.print("���Ե���ʯͷ\t\n���ٴ�����");
				break;
			case 1:
				System.out.print("���Ե��Ǽ���\t\n���ٴ�����");
				break;
			case 2:
				System.out.print("���Ե��ǲ�\t\n���ٴ�����");
				break;
			}	
		n=input.nextInt();
		}
		System.out.print("�������");
	}

}