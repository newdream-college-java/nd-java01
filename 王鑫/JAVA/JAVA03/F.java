/*
����һ��int�͵����ݣ��ж�������Ƿ��ܱ�2����������ܱ�2��������ô������������ż������������������������������
	��ʾ�� 8%2==0  10%2==0
		9%2==1
*/

import java.util.Scanner;

public class F{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int n = input.nextInt();
		if(n%2==0){
			System.out.print("�������ż��");
		}else{
			System.out.print("�����������");
		}
	}
}