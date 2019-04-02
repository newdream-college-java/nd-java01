package java课后作业15章继承;

import java.io.ObjectInputStream.GetField;

public class Zy2_2Text {
	public static void main(String[] args) {
		Zy2_2Fish zf = new Zy2_2Fish(5, 2);
		zf.info(zf.getAge());

		Zy2_2Bird zb = new Zy2_2Bird("红色", 5);
		zb.info(zb.getAge());
	}
}
