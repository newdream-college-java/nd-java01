import java.util.Scanner;
public class Qs{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("����2��������");
		int x = input.nextInt();
		String z = input.next();
		int y = input.nextInt();
		
		double a;
		if(z.equals("+")){
			System.out.println("x"+"+"+"y�ĺ�Ϊ��"+(x+y));
		}else if (z.equals("-")){
			System.out.println("x"+"-"+"y�ĺ�Ϊ��"+(x-y));
		}else if (z.equals("*")){
			System.out.println("x"+"*"+"y�ĺ�Ϊ��"+(x*y));
		}else  if(z.equals("/"))	{
			System.out.println("x"+"/"+"y�ĺ�Ϊ��"+(x/y));
			
		}
		//System.out.println("������");
	}


}


