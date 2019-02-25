import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int a=input.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100;
		/*System.out.println("b="+b"\tc="+c+"\td="+d);*/
		int e;
		e=b;
		b=c;
		c=d;
		System.out.println("e="+e+"\tb="+b+"\tc="+c);
}
}