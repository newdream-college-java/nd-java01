import java.util.Scanner;
public class java06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int n = input.nextInt();
		int a = n/100;
		int b = n/10%10;
		int c = n%10;
		System.out.println("a="+a+"b="+b+"c="+c);
		int d;
		d = c;
		c = a;
		a = d;
		System.out.println("��������ֵΪ:"+(a*100+b*10+c));
	}
}