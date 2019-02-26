import java.util.Scanner;
public class B05{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		System.out.print("请输入小时数：");
		int xs=input.nextInt();
		int ts=xs/24;
		int ys=xs%24;
		System.out.print(ts+"天"+"零"+ys+"个小时");
		


	}




}
