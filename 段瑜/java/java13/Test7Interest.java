package ��ҵ;

import java.util.Scanner;

public class Test7Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Interest a=new Interest();
		System.out.println("����������");
		a.show(input.nextInt());
		System.out.println("����������·ݣ�");
		a.show1(input.nextInt());
		System.out.println("���ܹ���Ҫ���"+a.interest);
		System.out.println("��ÿ����Ҫ������Ϊ��"+a.Moon);
	}

}
