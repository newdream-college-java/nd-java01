import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������������");
		int a = input.nextInt();
		int b =input.nextInt();
		System.out.println("a��b��ֵ����ǰΪ"+a+"\t"+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a��b��ֵ������Ϊ"+a+"\t"+b);
	}
}
