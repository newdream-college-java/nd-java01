package ��14�·�װ��ҵ;

import java.util.Scanner;

public class Student1Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student1 st = new Student1();
		System.out.print("������ѧ������");
		String name =input.next();
		st.setName(name);
		System.out.print("������ѧ������");
		int age =input.nextInt();
		if(age>=15){
			st.setAge(age);
		}else{
			st.setAge(18);
		}
		st.showMyself();
	}
}
