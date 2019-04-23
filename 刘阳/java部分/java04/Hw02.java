import java.util.Scanner;
public class Hw02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入猴子买桃数：");
		int a = input.nextInt();
		if(a>5){
			a=a+2;
			System.out.print("猴子买了"+a+"个桃子。");
		}else if(a>=3){
			a=a+1;
			System.out.print("猴子买了"+a+"个桃子。");
		}else{
			System.out.print("猴子买了"+a+"个桃子。");
		}
	}
}