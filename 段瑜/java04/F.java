import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入月份");
		int sum=input.nextInt();
		System.out.println("输入日期");
		int sum1=input.nextInt();
		int c=(sum-1)*30+sum1-1;
		System.out.println("今年一月一号到今天的总天数为："+c);
		

	}
}