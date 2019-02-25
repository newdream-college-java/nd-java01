/**
**猴子去买桃，如果买3个以下，老板就不送桃，如果买3个到5个就再送一个桃，如果买
**5个以上就送2个桃，现在要求输入猴子的买桃数，最后输出到底买到了几个桃
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入猴子的买桃数:");
		int a=input.nextInt();
		switch(a/3){
			case 0:
				System.out.println("不送桃");
				break;
			case 1:
				System.out.println("送一个桃");
				break;
			default:
				System.out.println("送两个桃"); 
		}	
	}
}