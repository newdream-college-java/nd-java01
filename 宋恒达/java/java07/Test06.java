/**
**输入一个整数n，统计1到n中有多少个奇数和偶数
**/
import java.util.Scanner;
public class Test06{
	public static  void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int a=input.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=a;i++){
			if(i%2==0){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("1到n有"+sum1+"个偶数，有 "+sum2+"个奇数");
	}
}