package java�κ���ҵ15�¼̳�;

public class Zy2_2Bird extends Zy2_2Animal {
	private String Color;

	public Zy2_2Bird(String Color, int age) {
		super(age);
		this.Color = Color;

	}

	public void info(int age) {
		System.out.println("����һֻ" + Color + "����");
		System.out.println("�ҽ���" + age + "���ˣ�");
	}
}
