import java.util.Scanner;
public class java02{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入猴子买桃数");
	int peachs=input.nextInt();
	if(peachs<3){
		System.out.println("购买了"+peachs+"个桃");
	}else if(peachs>=3&&peachs<=5){
		System.out.println("购买了"+(peachs+1)+"个桃");
	}else if(peachs>5){
		System.out.println("购买了"+(peachs+2)+"个桃");
	}
	}
}