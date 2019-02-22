import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个小数");
		double a = input.nextDouble();
		System.out.print("再输入一个小数");
		double b = input.nextDouble();
	
		double c=a;
		a=b;
		b=c;
	
		System.out.print("交换后：a="+a+"\n"+"b="+b);

	}




}