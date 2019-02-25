import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入三个数");
		int	sum=input.nextInt();
		int	sum1=input.nextInt();
		int	sum2=input.nextInt();
		if(sum==sum1&&sum1==sum2){
			System.out.println("这三个数相等");
			if(sum+sum1+sum2>1000){
				System.out.println("这三个数之和大于1000");
				}
		}else if(sum+sum1+sum2>1000){
			System.out.println("这三个数之和大于1000");
		}else{
			System.out.println("这三个数之和不大于1000");
			}
	}
}