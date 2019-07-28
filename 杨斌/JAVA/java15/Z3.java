public class Z3 {
	public static void main(String[] args) {
		Child c=new Child();
	}
}
//运行结果是Base和child，因为子类在使用构造方法的时候会默认有一个super()语句方法调用父类无惨构造语句，并且是第一句输出