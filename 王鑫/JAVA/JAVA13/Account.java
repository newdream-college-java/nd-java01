package Test2019_3_6_z13;

import java.util.Scanner;

public class Account {
	double  money = 0;
	public void ck(int n){
		money+=n;
		System.out.println("���ɹ�");
		System.out.println("\n***��ǰ���Ϊ:"+money+"Ԫ***");
	}
	public void qk(int n){
		while (true) {
			if (money-n>=0) {
				money-=n;
				System.out.println("ȡ��ɹ�");
				System.out.println("\n***��ǰ���Ϊ:"+money+"Ԫ***");
				break;
			}else{
				System.out.println("�˻����㣬ȡ��ʧ�ܣ�����");
				Scanner input = new Scanner(System.in);
				System.out.print("������ȡ����:");
				n=input.nextInt();
			}
		}
	}
}
