package 十六章作业;    //选b
class Base{
	public void method(){
		System.out.println("Base method");
	}
}
class Child extends Base{
	public void method(){
		System.out.println("Child method");
	}
}
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Child();
		base.method();
	}

}
