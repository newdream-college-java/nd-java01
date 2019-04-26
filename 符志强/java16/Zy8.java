package ื๗าต;
class Person{
	String name;
	int age;
	public void eat() {
		System.out.println("person eating with mouth");
	}
	public void sleep() {
		System.out.println("sleeping in night");
	}
}
class Chinese extends Person{
	public void eat() {
		System.out.println("Chinese eating rice with mouth by chopsticke");
	}
	public void shadowBoxing() {
		System.out.println("practice shadowBoxing every morning");
	}
}
public class Zy8 {
	public static void main(String[] args) {
		Chinese ch = new Chinese();
		ch.eat();
		ch.sleep();
		ch.shadowBoxing();
		Person p = new Chinese();
		p.eat();
		p.sleep();
		//p.shadowBoxing();
	}

}
