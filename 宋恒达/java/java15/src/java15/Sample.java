package java15;
/**
 * 在计算机上编制如下代码，查看运行结果，并说明为什么？
 * 答：子类继承父类，当子类实例化对象时，会先调用父类的构造方法，然后再执行
 * 子类构造方法中的指令
 * @author mo
 *
 */
public class Sample {
	public static void main(String[] args) {
		Child c=new Child();
	}
}
