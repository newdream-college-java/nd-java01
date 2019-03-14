package Ê®ÁùÕÂ×÷Òµ;//D
class Person2{
	String name="person";
	public void shout(){
		System.out.println(name);
	}
}
class Student1 extends Person2{
	String name="student";
	String school="school";
}
public class Test9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 q=new Student1();
		System.out.println(q instanceof Student1);
		System.out.println(q instanceof Person2);
		System.out.println(q instanceof Object);
		System.out.println(q instanceof System);
	}

}
