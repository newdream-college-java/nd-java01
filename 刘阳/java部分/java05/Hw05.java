import java.util.Scanner;
public class Hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//��ʾ��
		System.out.print("������һ��0��2֮���������");
		int a=input.nextInt();
		switch(a){
			case 0:
				System.out.print("�������ʯͷ");
				break;
			case 1:
				System.out.print("������Ǽ���");
				break;
			case 2:
				System.out.print("������ǲ�");
				break;
			default:
				System.out.print("���벻�Ϲ棬����������");
				System.exit(-1);
		}
	}
}