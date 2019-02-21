import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入正方形的边长");
		double a = input.nextDouble();
		double b=a*a;
		double c=4*a;
		System.out.println("正方形的面积为：    "+b);
		System.out.println("正方形的周长为：    "+c);
	}
}