import java.util.Scanner;
public class Hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示：
		int i =1,n;
		double sum=0;
		System.out.print("请输入一个整数：");
		n=input.nextInt();
		do{	
			if(n>0){
				sum=sum+1.0/i;
			}else{
				System.out.print("输入错误");
				System.exit(-1);
			}
			i++;
		}while(i<=n);
		System.out.print("1+1/2+1/3+....+1/n="+sum);
	}
}