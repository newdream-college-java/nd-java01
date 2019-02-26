import java.util.Scanner;
public class C01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个三位数整数:");
		int j=input.nextInt();
		int a=j%10,b=j/10%10,c=j/100%10;
		if(c>b&&b>a){
			System.out.print("是降序数");

		}else{
			System.out.print("不是降序数");



		}
		







		}



}
