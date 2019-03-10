package 鱼鸟;

public class Bird extends Animal{
	Bird(String name,int age){
		setName(name);
		setAge(age);
		System.out.println("我是一只红色的"+getName()+"\n今年"+getAge()+"岁了");
	}
}
