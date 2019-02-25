import java.util.Scanner;
public class Qoo{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("循环输入大于0的数字");
		int a = input.nextInt();
		int h=0;
		while(a>0){
			h=h+a;
			System.out.println("输入大于0的数字");
			a = input.nextInt(); 
			//h=h+a;
			//System.out.println("和");
			if(a==0){
			//System.out.println("结束");
			break;
			}
		}	System.out.println("和"+h);
	}

}