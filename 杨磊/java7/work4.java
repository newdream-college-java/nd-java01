//统计数字个数
import java.util.*;
public class work4{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int m=0,n=0,l=0;
		for(;;){
			System.out.print("请输入数字：");
			double a = input.nextDouble();
			if(a==999){
				break;
			}
			if(a>0){
				m++;
			}
			if(a<0){
				n++;
			}
			if(a==0){
				l++;
			}
		}
		System.out.print("正数的个数为"+m+"\t负数的个数为"+n+"\t0的个数为"+l);
	}
}