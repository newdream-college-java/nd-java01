package com.java.java16;
abstract class Person{
	String name;
	int age;
	public void eat(){
		System.out.println("person eating with mouth");
	}
	public void sleep(){
		System.out.println("sleeping in night");
	}
	public abstract void shadowBoxing();
}
class Chinese extends Person{
	public void eat(){
		System.out.println("Chinese eating rice with mouth by chopsticks");
	}
	public void shadowBoxing(){
		System.out.println("practice shadowBoxing every morning");
	}
}
public class Test1_8 {
	public static void main(String[] args) {
		Chinese ch=new Chinese();
		ch.eat();
		ch.sleep();
		ch.shadowBoxing();
		Person p=new Chinese();
		p.eat();
		p.sleep();
		p.shadowBoxing();
	}
}
