import java.util.Scanner;
public class N{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��С��");
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("��������Ϊ"+b+"С������Ϊ"+c);
	}
}