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
		System.out.println("请输入你的贷款金额");
		dkje=input.nextDouble();
		zlx=dkje*nl;
		System.out.println("请输入你的还款年限");
		dknx=input.nextDouble();
		nhk=(dkje+zlx)/dknx;	
		yhk=nhk/12;
		System.out.println("你的月还款金额为："+yhk);
		
	}
}
