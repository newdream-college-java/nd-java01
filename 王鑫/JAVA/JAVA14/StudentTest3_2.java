package Test2019_3_8_z14;

import java.util.Scanner;

public class StudentTest3_2 {
	public static void main(String[] args) {
		String name ;
		int age = 18;
		String sex;
		String major;
		Scanner input =new Scanner(System.in);
		System.out.print("������ѧ��������");
		name=input.next();
		System.out.print("������ѧ�����䣺");
		age=input.nextInt();
		if (age<15) {
			age=18;
		}
		System.out.print("������ѧ���Ա�");
		sex=input.next();
		System.out.print("������ѧ��רҵ��");
		major=input.next();
		Student3_2 student = new Student3_2(name,age,sex,major);
	}
}
