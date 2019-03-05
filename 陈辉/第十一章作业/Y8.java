package java11;
import java.util.Scanner;
public class Y9 {
	String nain;
	int a;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("输入年份");
		a=input.nextInt();
		if(a%4==0&&a%100!=0||a%400==0) {
			System.out.println("这一年是润年");
			
		}else{
			System.out.println("这一年是平年");
		}
		
	}
}
