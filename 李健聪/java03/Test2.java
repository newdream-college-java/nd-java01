import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		int a = input.nextInt();
		System.out.print("��������һ������");
		int b = input.nextInt();
		if(a>b){
			System.out.println(a+">"+b);
		}
		if(a<=b){
			System.out.println(a+"<"+b);
			}
	}
}