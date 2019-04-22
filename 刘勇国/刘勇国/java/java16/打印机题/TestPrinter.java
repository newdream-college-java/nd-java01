package 第15章继承作业____2车辆租赁;

public class TestPrinter {
	public static void main(String[] args) {
		Printer p1=new DotmatrixPrinter();
		//两种方式
		//方式一new出对象p1后，因为子类DotmatrixPrinter类中重写print方法
		//可以直接用p1调用DotmatrixPrinter中的print方法
		p1.print();
		//方式二
		//写一个方法(fun)将父类引用（形参Printer p）作为参数实现父类的打印功能
		//再new出具体子类对象，将实例化的子类对象作为实参传入方法fun
		p1.print();
		Printer p2 =new InkperPrinter();
		p2.print();
		fun(p2);
		Printer p3 =new LaserPrinter();
		p3.print();
		fun(p3);
	}
	//方式二
	//将父类作为参数传入方法fun，s
	public static void fun(Printer p){
		p.print();
	}
}
