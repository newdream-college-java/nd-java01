package zuoye;

import java.util.Scanner;

public class Zylei7 {
	Scanner input=new Scanner(System.in);
	double zlx;
	double nl;
	double yhk;
	double dkje;
	double dknx;
	double nhk;
	public void a() {
		nl=0.1;
		System.out.println("��������Ĵ�����");
		dkje=input.nextDouble();
		zlx=dkje*nl;
		System.out.println("��������Ļ�������");
		dknx=input.nextDouble();
		nhk=(dkje+zlx)/dknx;	
		yhk=nhk/12;
		System.out.println("����»�����Ϊ��"+yhk);
		
	}
}
