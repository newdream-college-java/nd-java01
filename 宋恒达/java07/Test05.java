/**
**输入一个整数n，如果n大于0，则求和：1+1/2+1/3+...+1/n,否则输出：输入错误
**/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=-1;
		double sum=0;
		System.out.print("请输入一个大于0的整数:");
		if(input.hasNextInt()){
			a=input.nextInt();
			if(a>0){
				for(int i=1;i<a;i++){
					sum+=(1.0/i);
				}
			}else{
				System.out.println("输入错误");
				System.exit(-1);
			}
		}else{
			System.out.println("输入错误");
			System.exit(-1);
		}
		System.out.println("1+1/2+1/3+...+1/n="+sum);
	}
}