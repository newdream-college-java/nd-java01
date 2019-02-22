import java.util.Scanner;
public class java03{
	public static void main(String[] args){
	System.out.println("请输入一个整数n，打印出一个n行三角形");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
		//控制一共有i行
	for(int i=1;i<=n;i++){
		//控制每行的空格数
		for (int xx=n-1;xx>=i;xx--){
			System.out.print(" ");
		}
		//控制每行的星星数
		for(int j=1;j<=2*i-1;j++){
			System.out.print("*");
		}
		//控制打印完每行的空格和星星后换行
		System.out.println();
	}
	}
}