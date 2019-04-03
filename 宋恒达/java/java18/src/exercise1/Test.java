package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 按照控制台提示输入1~3之间的数字，程序将输出相应的课程名称，输入1输出“C#”
 * 输入2输出“java编程”，输入3输出“SQL基础”，根据键盘输入进行判断，输出对应
 * 课程名称，如果输入错误，给出错误提示，不管输入是否正确，均输出“欢迎提出建议”语句
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入课程代号（1-3之间的数字）：");
		try {
			int num=input.nextInt();
			switch(num) {
				case 1:
					System.out.println("C#！");
					break;
				case 2:
					System.out.println("JAVA编程！");
					break;
				case 3:
					System.out.println("SQL基础！");
					break;
				default:
					System.out.println("输入错误！");
			}
		}catch(InputMismatchException e) {
			System.out.println("输入错误！");
		}catch(Exception e) {
			
		}finally {
			System.out.println("欢迎提出建议！");
		}
	}
}
