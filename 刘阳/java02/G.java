import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��С��");
		double a = input.nextDouble();
		System.out.print("������һ��С��");
		double b = input.nextDouble();
	
		double c=a;
		a=b;
		b=c;
	
		System.out.print("������a="+a+"\n"+"b="+b);

	}




}