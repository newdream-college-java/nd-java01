package Test2019_3_17_z18;

import java.util.Scanner;

public class Test_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入课程代号（1~3之间的数字）：");
		Course_1_1 cou = new Course_1_1(input.nextInt());
	}
}
