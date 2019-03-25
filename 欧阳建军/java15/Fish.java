package 第15章继承作业;

public class Fish extends Animal {
	int weig ;
	public void info(){
		type="鱼!";
		weig=5;
		age=2;
		System.out.println("我是一只"+weig+"斤重的"+type+"\n今年"+age+"岁了！");
	}
}
