package Test2019_3_5_z12;

import java.util.Scanner;

public class User {
	String name="���";
	int jf = 0;
	public int showFist(){
		Scanner input = new Scanner(System.in);
		System.out.print("���ȭ��1.����2.ʯͷ3.���������Ӧ�����֣���");
		int n = input.nextInt();
		while (n>3&&n<1) {
			System.out.print("���ȭ��1.����2.ʯͷ3.���������Ӧ�����֣���");
			n = input.nextInt();
		}
		if (n==1) {
			System.out.println("���ȭ������");
		}else if (n==2) {
			System.out.println("���ȭ��ʯͷ");
		}else {
			System.out.println("���ȭ����");
		}
		return n;
	} 
}
