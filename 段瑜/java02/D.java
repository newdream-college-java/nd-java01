import java.util.Scanner;
public class D{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入边长");
	int a=input.nextInt();
	int b=a+a+a+a;
	int c=a*a;
	System.out.println("边长为："+b+"\t周长为："+c);
	
}
}