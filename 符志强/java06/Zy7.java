/*输入除0以为的数求和 输入0结束*/
import java.util.Scanner;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数");
		int h=0,a=input.nextInt();
		
		while(a!=0){
			h=h+a;
			System.out.println("请输入一个加数，结束输入0");
			a=input.nextInt();
			
				
		}
		System.out.println("累加结果为："+h);
	}
}