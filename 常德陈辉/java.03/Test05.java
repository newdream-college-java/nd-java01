/*输入一个三位整数，判其是不是降序数如：531是降序数 百位>十位>个位*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入一个三位整数：");
	int a=input.nextInt();
	int b=a/100%10,c=a/10%10,d=a%10;
	if(b>c&&c>d){
		System.out.print("是降序数");
		}
	}
}