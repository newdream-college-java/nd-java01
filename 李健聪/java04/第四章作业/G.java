import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入一个数     ");
		double sr,sc;
		sr=input.nextDouble();
		System.out.print("请再输入一个数   ");
		sc=input.nextDouble();
		System.out.println("请输入要进行运算的符号     ");
		String a=input.next();
		if(a.equals("+")){
			System.out.println("两个数相加="+(sr+sc));
		}
		if(a.equals("-")){
			System.out.println("两个数相减="+(sr-sc));
		}
		if(a.equals("*")){
			System.out.println("两个数相乘="+(sr*sc));
		}
		if(a.equals("/")){
			System.out.println("两个数相除="+(sr/sc));
		}
		
	}
}