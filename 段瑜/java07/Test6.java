import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int n=input.nextInt();
		double a=0;
		for(int i=1;i<=n;i++){
			a=a+1.0/i;
		}
		if(n<0){
			System.out.println("输入错误！");
		}else{
			System.out.println(a);
		}
	}	
}