package Test2019_2_28;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("������ڱ��µ����Ѽ�¼");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������"+(i+1)+"�ʹ����");
			sum+=arr[i]=input.nextInt();
		}
		System.out.println("\n\n���\t\t���");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(1+i+"\t\t"+arr[i]);
		}
		System.out.println("�ܽ��\t\t"+sum);
	}
}
