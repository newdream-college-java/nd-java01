import java.util.Scanner;


public class Testrn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int a=input.nextInt();
		Rn rn=new Rn();
		rn.a=a;
		rn.ff();
	}

}
