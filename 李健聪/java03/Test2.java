import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数");
		int a = input.nextInt();
		System.out.print("请再输入一个整数");
		int b = input.nextInt();
		if(a>b){
			System.out.println(a+">"+b);
		}
		if(a<=b){
			System.out.println(a+"<"+b);
			}
	}
}