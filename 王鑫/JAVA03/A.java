//����һ����λ�����������ǲ��ǽ������磺531�ǽ����� ��λ>ʮλ>��λ

import java.util.Scanner;

public class A{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��3λ����");
		int n = input.nextInt();
		int a = n/100,b=n/10%10,c=n%10;
		if(a>b&&b>c){
			System.out.print("�ǽ�����");
		}else{
			System.out.print("���ǽ�����");
		}
	}
}