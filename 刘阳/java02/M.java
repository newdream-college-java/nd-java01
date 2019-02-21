import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个三位数：");
		int num = input.nextInt();
		//定义计算出每个数位上的数
		int a=num%10;
		int b=num/10%10;
		int c=num/100%10;
		System.out.println("交换之前为："+num);
		int d=a;
		a=c;
		c=d;


		
		System.out.print(c+""+b+""+a);
		/*System.out.print(b);
		System.out.print(a);*/
	}
}