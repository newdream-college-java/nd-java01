package jdbc01;

import java.util.Scanner;
public class jdbc01 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		test t1=new test();
		boolean goOn;
		do {
			goOn=true;
			System.out.println("============================��ӭ���ʳ����̵�============================");
			System.out.println("1.��ӳ�����Ϣ\t2.�޸ĳ�����Ϣ\t3.��ѯ������Ϣ\t4.���������Ϣ\t0.�˳�");
			System.out.println("����������ѡ��:");
			int num=sc.nextInt();
			switch(num) {
				case 4:
					System.out.println("�����̵�>�������");
					t1.insertMaster();
					break;
				case 0:
					System.out.println("лл���Ĺ��٣��ټ�");
					goOn=false;
					break;
				default:
					System.out.println("����ѡ������");
					break;
			}
		}while(goOn);
		
	}
}
