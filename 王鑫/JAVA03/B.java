// ����һ����ݣ���������꣬�������һ�������꣬���������һ����ƽ�ꡣ���꣺����ܱ�4�������Ҳ��ܱ�100�����������ܱ�400����

import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("���������:");
		int n = input.nextInt();
		if(n%4==0&&n%100!=0||n%400==0){
			System.out.print("������");
		}else System.out.print("��ƽ��");
	}
}