package Test2019_2_28;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//��������arr��δ���ĵ��ַ�������
		String[] arr = {"Island","Ocean","Pretty","Sun"};
		System.out.print("����ǰ������Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  "+arr[i]);
		}
		//������ַ���
		System.out.print("\n����������ƣ�");
		String p = input.next();
		//����һ���ַ�����������Ų���������
		String[] brr = new String[5];
		//ѭ���жϿ�ʼ����       
		for (int i = 0; i < arr.length; i++) {
			if (p.compareTo(arr[i])<0) {
				//��ʼ����
				for (int j = brr.length-1; j >i; j--) {
					brr[j]=arr[j-1];
				}
				brr[i]=p;
				break;
			}else{
				brr[i]=arr[i];					
			}
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
	}
}
