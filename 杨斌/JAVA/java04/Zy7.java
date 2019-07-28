import java.util.Scanner;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个数\n");
		double a=input.nextInt();
		System.out.print("请输入算术符\n");
		String b=input.next();
		System.out.print("请输入第二个数\n");
		double c=input.nextInt();
		if(b.equals("+")){
			double d=a+c;
			System.out.print(d);
		
		}else if(b.equals("-")){
			double d=a-c;
			System.out.print(d);
		}else if(b.equals("*")){
			double d=a*c;
			System.out.print(d);
		}else if(b.equals("/")){
			double d=a/c;
			System.out.print(d);
		}else{
			System.out.print("输入错误");
		}


	}
}	