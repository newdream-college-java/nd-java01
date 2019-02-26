//输入一个整数，大于0就求和否则错误！
import java.util.*;
public class work5{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int a = input.nextInt();
		double sum =0;
		if(a>0){
			for(int i=1;i<=a;i++){
				sum = sum+1.0/i;
			}
			System.out.print(sum);
		}else{
			System.out.print("输入错误！");
	
		}
	}
}