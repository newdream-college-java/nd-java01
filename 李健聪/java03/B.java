import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int a=input.nextInt();
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.print(a+"是闰年");
		}else{
			System.out.print(a+"不是闰年");
		}
	}
}