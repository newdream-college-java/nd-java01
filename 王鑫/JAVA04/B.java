//�������̴���


import java.util.Scanner;

public class B{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("���������õ����Σ�");
		int n = input.nextInt();
		if(n==1){
			System.out.println("��õ�һ��:���μ���ʡ����ѧ��֯��һ��������Ӫ");
		}else if(n==2){
			System.out.println("��õڶ���:���������ձʼǱ�����һ��");
		}else if(n==3){
			System.out.println("��õ�����:������ƶ�Ӳ��һ��");
		}else{
			System.out.println("�ٽ�����");
		}
		
	}
}