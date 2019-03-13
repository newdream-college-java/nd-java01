package 十五章作业;
class Base{		
	public Base(){
		System.out.println("base");
	}
}
class Child extends Base{
	public Child(){
		System.out.println("Child");
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
	}

}
/*运行结果为 base换行 Child 因为Child类new了对象c，
 * 首先自动调用父类的无参构造方法输出base，然后在调用Chlid的无参构造方法输出Chile*/
