import java.util.Scanner;
public class T4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入3个整数");
		int a =input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
		int min;
		min = a;
		if(b<min){
			min=b;
		}
		if(c<min){
			min =c;
		}
		System.out.print(a+"\t"+b+"\t"+c+"中最小值为"+min);
	}
}