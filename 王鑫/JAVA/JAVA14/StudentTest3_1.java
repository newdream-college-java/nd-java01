package Test2019_3_8_z14;

import java.util.Scanner;

public class StudentTest3_1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Student3_1 student = new Student3_1();
		System.out.print("请输入学生姓名：");
		student.setName(input.next());
		System.out.print("请输入学生年龄：");
		student.setAge(input.nextInt());
		student.show();
	}
}
