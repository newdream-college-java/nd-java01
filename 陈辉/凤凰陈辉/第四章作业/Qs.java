import java.util.Scanner;
public class Qs{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("输入2个操作数");
		int x = input.nextInt();
		String z = input.next();
		int y = input.nextInt();
		
		double a;
		if(z.equals("+")){
			System.out.println("x"+"+"+"y的和为："+(x+y));
		}else if (z.equals("-")){
			System.out.println("x"+"-"+"y的和为："+(x-y));
		}else if (z.equals("*")){
			System.out.println("x"+"*"+"y的和为："+(x*y));
		}else  if(z.equals("/"))	{
			System.out.println("x"+"/"+"y的和为："+(x/y));
			
		}
		//System.out.println("输出结果");
	}


}


