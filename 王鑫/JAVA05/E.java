/*
ѭ��Ҫ���û�����һ����֮�����������������0�Ǿ�������������ʯͷ������������1�Ǿ������������Ǽ�������
��������2�Ǿ������������ǲ�����������������ͽ�������
*/

import java.util.Scanner;

public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("�����룺");
		int n = input.nextInt();
		while(n==0||n==1||n==2){
			if(n==0){
				System.out.print("���������ʯͷ\n���ٴ����룺");
			}else if(n==1){
				System.out.print("��������Ǽ���\n���ٴ����룺");
			}else {
				System.out.print("��������ǲ�\n���ٴ����룺");
			}
			n = input.nextInt();
		}
	}
}