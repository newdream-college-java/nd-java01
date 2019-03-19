package 作业;
import java.util.Scanner;

public class Zy5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a=new int[5];
		try {			
			for (int i = 0; i <=a.length; i++) {
				System.out.println("请输入数组里的值");
				a[i]=input.nextInt();
			}				
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
        }catch(Exception e) {
        	System.out.println(" 其他类型的异常");
        }
	}
}
