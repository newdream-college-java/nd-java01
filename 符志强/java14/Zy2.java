package ��ҵ;

import java.util.Scanner;

public class Zy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����������");
		System.out.print("������Ҫ�����ĳ�������֣�");
		String mz=input.next();
		boolean f=false;
		while (!f) {
			System.out.println("��ѡ��Ҫ�����ĳ�������ͣ���1.����  2.��죩");
			int x=input.nextInt();
			if (x==1) {
				Zylei2 a=new Zylei2();
				a.print(mz);
				f=true;
			}else
			if (x==2) {
				Zylei22 b=new Zylei22();
				b.print(mz);
				f=true;
			}else{
				System.out.println("�����������������");
				System.out.println("��ѡ��Ҫ�����ĳ�������ͣ���1.����  2.��죩");
				x=input.nextInt();
			}
		}
	}
}
