package Test2019_3_8_z14;

import java.util.Scanner;

public class StudentTest3_1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Student3_1 student = new Student3_1();
		System.out.print("������ѧ��������");
		student.setName(input.next());
		System.out.print("������ѧ�����䣺");
		student.setAge(input.nextInt());
		student.show();
	}
}
