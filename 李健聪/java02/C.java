import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������������������ʹ�����ٸ�Сʱ");
		int a = input.nextInt();
		int b;
		b=a/24;
		int c;
		c=a%24;
		System.out.println("\""+b+"����"+c+"��Сʱ\"");
	}
}