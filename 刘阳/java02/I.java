/*通过输入正方形的边长，最后输出正方形的周长与面积。*/
import java.util.Scanner;
public class I{
	public static void main(String[] args){
		//创建Scanner对象
		Scanner input = new Scanner(System.in);
		System.out.print("请输入正方形的边长");
		double a = input.nextDouble();
		double b=a*4;
		double c=a*a;
		//输出正方形的周长和面积
		System.out.print("正方形的周长="+b+"\n"+"正方形的面积="+c);

	}


}