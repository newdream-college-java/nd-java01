import java.util.Scanner;
public class java05{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入三个整数");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int max;
	if(a>b){
		max=a;
		a=b;
		b=max;
	}
	if(b>c){
		max=b;
		b=c;
		c=max;
	}
	if(a>b){
		max=a;
		a=b;
		b=max;
	}
	System.out.println("升序排列为"+a+"<"+b+"<"+c);
	}
}