package java16;

public abstract class Person {
	String name;
	int age;
	public void eat() {
		System.out.println("Person eat with mouth");
	}
	public void sleep() {
		System.out.println("practice shadowBoxing every evening");
	}
	public abstract void shadowBoxing();
}
