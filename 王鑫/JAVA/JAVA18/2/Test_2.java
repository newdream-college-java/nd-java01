package Test2019_3_17_z18;

import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person2 person = new Person2();
		
		System.out.print("请输入的姓名：");
		person.setName(input.next());
		
		System.out.print("请输入年龄：");
		try {
			person.setAge(input.nextInt());
		} catch (Exception e) {
			System.out.println("请正确输入年龄1~100");
		}
		
		System.out.print("请输入的性别：");
		try {
			person.setSex(input.next());
			person.print();
		} catch (Exception e) {
			System.out.println("请正确输入性别（男，女）");
		}
	}
}
