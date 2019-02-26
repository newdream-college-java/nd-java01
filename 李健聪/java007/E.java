import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=0.0;
		System.out.println("请输入一个整数");
		double n=input.nextDouble();
		if(n>0){
			for(int i=1;i<=n;i++){
				sum=sum+1*1.0/i;
			}System.out.println(sum);
		}else{
			System.out.println("输入错误，退出程序");
		}
	}
}