import java.util.Scanner;
public class Zy1{
	public static void main(String[] args){
		Scanner input =new Scanner (System.in);
		System.out.print("������a��ֵ��");
		double a =input.nextDouble();
		System.out.print("������b��ֵ��");
		double b =input.nextDouble();
		double c;
		c=a;
		a=b;
		b=c;
		System.out.print("a="+a+"\nb="+b);
		
	}
}