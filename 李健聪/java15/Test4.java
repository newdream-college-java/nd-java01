package 十五章作业;
class Base{				//报错  选D
	private String name;
	public Base(){
		name="Base constructor";
	}
	public Base(String pName){
		name=pName;
	}
	public void method(){
		System.out.println(name);
	}
}
public class Child extends Base{
	public Child(){
		super("Child constructor");
	}
	public void method(){
		System.out.println("Child method");
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.method();
	}

}
