package 十六章作业;
class Person{
	String name;
	int age;
	public void ear(){
		System.out.println("person eating with mouth");
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
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese ch=new Chinese();
		ch.eat();
		ch.sleep();
		ch.shadowBoxing();
		Person p=new Chinese();
		p.ear();
		p.sleep();
		((Chinese) p).shadowBoxing();//子类的方法是独有的  不能用父类引用来使用
	}

}
