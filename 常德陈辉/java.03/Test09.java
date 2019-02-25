/*输入一个int的数据，判断这个数是否能被2整除，如果能被2整除，那么输出“这个数是偶数”，否则输出“这个数是奇数”。*/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入一个整数");
	int a=input.nextInt();
	if(a%2==0){
		System.out.print("这个数是偶数");
		}else{
		System.out.print("这个数是奇数");
		}
	}

}