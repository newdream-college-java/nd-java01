package 十六章作业;   //选C  
class Base2{
	public void method(){
		System.out.println("Base method");
	}
}
class Child2 extends Base2{
	public void method(){
		System.out.println("Child methodB");
	}
}
public class Test9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base2 base=new Child2();
		base.method();
	}

}
