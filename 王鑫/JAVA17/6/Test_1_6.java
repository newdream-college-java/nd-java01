package Test2019_3_14_z17;

import java.util.Scanner;

public class Test_1_6 {
	public static void main(String[] args) {
		Animal_1_6 an = new Animal_1_6_1();
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈë³èÎïµÄÃû×Ö£º");
		String name = input.next();
		if (name.equals("¹·¹·")) {
			Dog_1_6 dog = new Dog_1_6();
			dog.setCar("ÍôÍôÍô");
			an.Shout(dog.getCar());
		}else if (name.equals("Ã¨ßä")) {
			Cat_1_6 cat = new Cat_1_6();
			cat.setCar("ß÷ß÷ß÷");
			an.Shout(cat.getCar());
		}else {
			Pig_1_6 pig = new Pig_1_6();
			pig.setCar("ºßºßºß");
			an.Shout(pig.getCar());	
		}
	}
}
