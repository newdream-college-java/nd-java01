package java课后作业15章继承;

public class Zy2_2Fish extends Zy2_2Animal {
	private int Kg;

	public void info(int age) {
		// System.out.println("");
		System.out.println("我是一只" + Kg + "公斤的鱼");
		System.out.println("今年" + getAge() + "岁了！");
	}

	public Zy2_2Fish(int Kg, int age) {
		super(age);
		this.Kg = Kg;
	}
}
