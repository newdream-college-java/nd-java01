import java.util.Scanner;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ����\n");
		double a=input.nextInt();
		System.out.print("������������\n");
		String b=input.next();
		System.out.print("������ڶ�����\n");
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
			System.out.print("�������");
		}


	}
}	