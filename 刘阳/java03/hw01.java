import java.util.Scanner;
public class hw01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ������");
		int num=input.nextInt();
		int a=num/100%10;
		int b=num/10%10;
		int c=num%10;
		if(a>b&&b>c){
			System.out.print("�������һ������������");
		}else{
			System.out.print("�������ǽ���������");
		}

	}

}