package java�κ���ҵ15�¼̳�;

public class Zy2_2Fish extends Zy2_2Animal {
	private int Kg;

	public void info(int age) {
		// System.out.println("");
		System.out.println("����һֻ" + Kg + "�������");
		System.out.println("����" + getAge() + "���ˣ�");
	}

	public Zy2_2Fish(int Kg, int age) {
		super(age);
		this.Kg = Kg;
	}
}
