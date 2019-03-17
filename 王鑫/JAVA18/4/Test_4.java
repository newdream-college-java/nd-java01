package Test2019_3_17_z18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n , m ;
		try {
			System.out.print("请输入被除数：");
			n = input.nextInt();
			System.out.print("请输入除数：");
			m = input.nextInt();
			System.out.println(n+"/"+m+"="+(n/m));
		} catch (InputMismatchException e) {
			System.out.println("被除数和除数必须是整数。");
		}catch (ArithmeticException e) {
			System.out.println("除数不能为零。");
		}catch (Exception e) {
			System.out.println("其他异常");
		}
		
	}
}
