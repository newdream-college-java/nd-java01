import java.util.Scanner;
public class java08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��С��");
		double n = input.nextDouble();
		int a = (int)n;
		double b = n-a;
		System.out.println("��������Ϊ��"+a+"\t\tС������Ϊ��"+b);
	}
}