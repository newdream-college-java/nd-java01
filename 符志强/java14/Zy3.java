package ��ҵ;

import java.util.Scanner;

public class Zy3 {

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
			System.out.print("��ѡ��Ҫ�����ĳ�������ͣ���1.����  2.��� 3.����");
			int x=input.nextInt();
			if (x==1) {
				Zylei3 a=new Zylei3(mz);
				f=true;
			}else
			if (x==2) {
				Zylei33 b=new Zylei33(mz);
				f=true;
			}else
			if (x==3) {
				Zylei333 c=new Zylei333(mz);
				f=true;
			}else{
				System.out.println("�����������������");
				System.out.print("��ѡ��Ҫ�����ĳ�������ͣ���1.����  2.��� 3.����");
				x=input.nextInt();
			}
		}
	}
}
