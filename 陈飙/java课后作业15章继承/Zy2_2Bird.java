package java课后作业15章继承;

public class Zy2_2Bird extends Zy2_2Animal {
	private String Color;

	public Zy2_2Bird(String Color, int age) {
		super(age);
		this.Color = Color;

	}

	public void info(int age) {
		System.out.println("我是一只" + Color + "的鸟！");
		System.out.println("我今年" + age + "岁了！");
	}
}
