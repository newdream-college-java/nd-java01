package 作业;
import java.util.Scanner;

public class Zy3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个被除数");
		int b=input.nextInt();
		System.out.println("请输入一个除数");
		int c=input.nextInt();
		try {
			System.out.println(String.format("%d / %d = %d", b, c, b / c));
		} catch(ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();      
        }catch(Exception e) {
            System.out.println(" 其他类型的异常");
        }finally {
            System.out.println("感谢使用本程序");
        }
	}
}
