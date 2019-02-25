import java.util.Scanner;
	public class B06{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入一个三位整数：");
			int a=input.nextInt();
			int b,c,d,e;
			b=a%10;
			c=a/10%10;
			d=a/100;
			e=b;
			b=c;
			c=d;
			System.out.print(e+""+b+""+c);
			
					
			


	}




}
