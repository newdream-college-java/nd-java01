package 第15章继承作业____3编写代码找错并纠错;

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
		//Person类是父类 p是父类实例化的对象，父类不能调用子类独有的方法，只能调用子类重写父类
		//的方法。所以p不能调用shadowBoxing方法
		//只能给Person类加一个shadowBoxing方法
	}
}
