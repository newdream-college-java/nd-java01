package Test2019_3_17_z18;

import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person2 person = new Person2();
		
		System.out.print("�������������");
		person.setName(input.next());
		
		System.out.print("���������䣺");
		try {
			person.setAge(input.nextInt());
		} catch (Exception e) {
			System.out.println("����ȷ��������1~100");
		}
		
		System.out.print("��������Ա�");
		try {
			person.setSex(input.next());
			person.print();
		} catch (Exception e) {
			System.out.println("����ȷ�����Ա��У�Ů��");
		}
	}
}
