import java.util.Scanner;
public class T5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a = input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
		if(a>b&b>c){
			System.out.print(a+"\t"+b+"\t"+c);
		}
		if(b>a&a>c){
			System.out.print(b+"\t"+a+"\t"+c);
		}
		if(a>c&c>b){
			System.out.print(a+"\t"+c+"\t"+b);
		}
		if(b>c&c>a){
			System.out.print(b+"\t"+c+"\t"+a);
		}
		if(c>b&b>a){
			System.out.print(c+"\t"+b+"\t"+a);
		}
		if(c>a&a>b){
			System.out.print(c+"\t"+a+"\t"+b);
		}
	}	
}