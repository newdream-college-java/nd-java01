import java.util.Scanner;
public class hw01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int num=input.nextInt();
		int a=num/100%10;
		int b=num/10%10;
		int c=num%10;
		if(a>b&&b>c){
			System.out.print("这个数是一个降序数！！");
		}else{
			System.out.print("此数不是降序数！！");
		}

	}

}