package 第15章继承作业;

public class Bird extends Animal {
	String color;
	public void info(){
		type="鸟";
		color="红色的";
		age=4;
		System.out.println("我是一只"+color+type+"!\n今年"+age+"了！");
	}

}
