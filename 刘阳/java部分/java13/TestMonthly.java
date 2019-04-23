package zuoye;

import java.util.Scanner;

public class TestMonthly {
	public static void main(String[] args) {
		Monthly monthly=new Monthly();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您要贷款的金额：");
		int jine=input.nextInt();
		System.out.println("请输入您贷款所执行的利率：");
		double rate=input.nextDouble();
		System.out.println("请输入您的贷款年限：");
		int year=input.nextInt();
		monthly.zlx(jine, rate,year);
	}
}
