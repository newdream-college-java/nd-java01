package 作业;
import java.util.Scanner;


public class Zy1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入1-3的整数");
		Scanner input=new Scanner(System.in);
		try {
			int s=input.nextInt();
			if (s==1) {
				System.out.println("C#编程");
			}else
			if (s==2) {
				System.out.println("java编程");
			}else
			if (s==3) {
				System.out.println("SQL基础");
			}else{
				System.out.println("输入错误");
			}
		} catch (Exception e) {
			System.out.println("输入错误，只能输入1-3的整数");
		}finally{
			System.out.println("欢迎提出建议");
		}
		
	}

}
