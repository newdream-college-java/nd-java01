package Test2019_3_17_z18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n , m ;
		try {
			System.out.print("�����뱻������");
			n = input.nextInt();
			System.out.print("�����������");
			m = input.nextInt();
			System.out.println(n+"/"+m+"="+(n/m));
		} catch (InputMismatchException e) {
			System.out.println("�������ͳ���������������");
		}catch (ArithmeticException e) {
			System.out.println("��������Ϊ�㡣");
		}catch (Exception e) {
			System.out.println("�����쳣");
		}
		
	}
}
