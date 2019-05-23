package 鱼鸟;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
	}

}/*输出是Base和Child，因为子类Child调用抽象父类Base时继承了父类的super()语句运行父类无参构造方法，在调用Child会生成一个
*super()语句运行Child的无参构造方法。
*/
