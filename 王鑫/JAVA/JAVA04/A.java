//2.1 ������

import java.util.Scanner;

public class A {
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.println("�������㹺�������������");
		int n = input.nextInt();
		if(n<3){
			System.out.println(n);
		}else if(n>=3&&n<=5){
			System.out.println(n+1);
		}else{
			System.out.println(n+2);
		}
		
	}
}