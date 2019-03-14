package Ê®ÁùÕÂ×÷Òµ;		//D
class Base1{
	public void method(){
		System.out.println("Base method");
	}
}
class Child1 extends Base{
	public void methodB(){
		System.out.println("Child methodB");
	}
}

public class Test9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Child();
		base.method();
	}

}
