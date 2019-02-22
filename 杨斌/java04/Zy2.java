import java.util.Scanner;
public class Zy2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("猴子买了多少个桃？\n");
		int a=input.nextInt();
		if(a>5){
			a=a+2;
		
		}else if(3<=a&&a<=5){
			a=a+1;
		}

		System.out.print("最后买了"+a+"个桃");

	}
	




}