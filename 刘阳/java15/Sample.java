
public class Sample {

	public static void main(String[] args) {
		Child c=new Child();
	}

}

/*输出结果为：
Base
Child
原因是因为在Sample类运行的时候，new Child类的对象时，调用了Child的构造方法，而Child构造方法的第一行
默认是super();方法，他会先Child的构造方法执行，执行结果是调用父类Base的无参构造方法。所以结果是这样！
*/