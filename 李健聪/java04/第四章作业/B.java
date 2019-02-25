import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你要买的桃子数量");
		int sr=input.nextInt();
		if(sr<3){
			System.out.print("你买了"+sr+"个桃子");
		}else if(sr>=3&&sr<=5){
			sr+=1;
			System.out.print("你买了"+sr+"个桃子");
		}else if(sr>5){
			sr+=2;
			System.out.print("你买了"+sr+"个桃子");
		}
	}
}