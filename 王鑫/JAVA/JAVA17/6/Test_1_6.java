package Test2019_3_14_z17;

import java.util.Scanner;

public class Test_1_6 {
	public static void main(String[] args) {
		Animal_1_6 an = new Animal_1_6_1();
		Scanner input = new Scanner(System.in);
		System.out.print("�������������֣�");
		String name = input.next();
		if (name.equals("����")) {
			Dog_1_6 dog = new Dog_1_6();
			dog.setCar("������");
			an.Shout(dog.getCar());
		}else if (name.equals("è��")) {
			Cat_1_6 cat = new Cat_1_6();
			cat.setCar("������");
			an.Shout(cat.getCar());
		}else {
			Pig_1_6 pig = new Pig_1_6();
			pig.setCar("�ߺߺ�");
			an.Shout(pig.getCar());	
		}
	}
}
