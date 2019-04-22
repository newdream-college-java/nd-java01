
/*输入三个整数，按数字大小从小到大排序输出*/
import java.util.Scanner;
public class Hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in );

		System.out.println("请输入三个整数");
		int a = input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();

		System.out.println("排序之前数字为："+a+"\t"+b+"\t"+c);
		int tm;
		if(a>b){
			tm=a;
			a=b;
			b=tm;
		}
		if(a>c){
			tm=a;
			a=c;
			c=tm;
		}
		if(b>c){
			tm=b;
			b=c;
			c=tm;
		}
		System.out.print(a+"\t"+b+"\t"+c);

	}	
}