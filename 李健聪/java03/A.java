import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个3位整数");
		int zs=input.nextInt();
		int a=zs/100%10,b=zs/10%10,c=zs%10;
		if(a>b&&a>c){
			System.out.println(zs+"是降序数");
		}else{
			System.out.println(zs+"不是降序数");
		}
	}
}