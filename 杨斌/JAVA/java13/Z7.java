import java.util.Scanner;
public class Z7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Loan la=new Loan();
		la.ll=0.05;
		System.out.print("请输入贷款金额：");
		int money=input.nextInt();
		System.out.print("请输入贷款年限：");
		int year=input.nextInt();
		la.show(money, year);
		
	}	
}
