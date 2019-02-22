import java.util.Scanner;
public class Zy6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入今天为几月");
		int a=input.nextInt();
		System.out.println("请输入今天为几日");
		int b=input.nextInt();	
		int c=(a-1)*30;
		int d=b+c;
		System.out.println(d);
		



	}

}