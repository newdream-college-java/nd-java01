/*
������һ�����б��չ����������롣���õ������Ǯ���������������붼Ҫ��ȷ��
�����һ�����붼����ȷ����ֱ�Ӱ����������棻ֻ�����������붼������ȷ�����õ�Ǯ�������������붼���Լ����ã�Ҫ�����볤�Ȳ��ܵ���6λ��
*/
import java.util.Scanner;
public class C{
	public static void main(String[] arge){
		System.out.print("�������һ������:");
		Scanner input = new Scanner(System.in);
		int password1=input.nextInt(),password2;
		if(password1==123456){
			System.out.print("\n������ڶ������룺");
			password2 = input.nextInt();
			if(password2==654321){
				System.out.print("����������ȷ������");
			}else System.out.print("�����������");
		}else{
			System.out.print("�����������");
		}
	}
}