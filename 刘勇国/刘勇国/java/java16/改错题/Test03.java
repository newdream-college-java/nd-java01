package ��15�¼̳���ҵ____3��д�����Ҵ�����;

class Person{
	String name;
	int age;
	public void eat(){
		System.out.println("persong eating with mouth");
	}
	public void sleep(){
		System.out.println("sleeping in night");
	}
}
class Chinese extends Person{
	public void eat(){
		System.out.println("Chinese eating rice with mouth by chopsticks");
	}
	public void shadowBoxing(){
		System.out.println("practice shadowBoxing every moring");
	}
}

public class Test03 {
	public static void main(String[] args) {
		Chinese ch = new Chinese();
		ch.eat();
		ch.sleep();
		ch.shadowBoxing();
		Person p = new Chinese();
		p.eat();
		p.sleep();
		//p.shadowBoxing();
		//Person���Ǹ��� p�Ǹ���ʵ�����Ķ��󣬸��಻�ܵ���������еķ�����ֻ�ܵ���������д����
		//�ķ���������p���ܵ���shadowBoxing����
		//ֻ�ܸ�Person���һ��shadowBoxing����
	}
}
