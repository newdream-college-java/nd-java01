import java.util.Scanner;
public class java02{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("输入年份");
	int year = input.nextInt();
	if((year%4==0&&year%100!=0)||(year%400==0)){
		System.out.println("输入的年份是闰年");
	}else{
		System.out.println("输入的年份不是闰年");
	}
	}
}