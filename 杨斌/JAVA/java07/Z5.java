import java.util.Scanner;
public class Z5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个大于0的整数：");
		int n=input.nextInt();
		double sum=0.0;
		while(n<=0){
			System.out.print("输入错误，请从新输入");
			n=input.nextInt();
		}
		for(int i=1;i<=n;i++){
	
				sum=sum+1.0/i;
		
		
		}
		System.out.print(sum);
	}
}