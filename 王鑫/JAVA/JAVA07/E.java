//����һ������n������1+1/2+1/3+1/4...+1/n,�����������

import java.util.Scanner;
public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double s= 0;
		for(int i = 1;i<= n; i++){
			s+=1.0/i;
		}
		System.out.print(s);
	}
}


