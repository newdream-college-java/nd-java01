package Ê®ÁùÕÂ×÷Òµ;//A
class Person3{
	String name="person";
	public void shout(){
		System.out.println(name);
	}
}
class Student extends Person3{
	String name="student";
	String school="school";
}
public class Test9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 s=new Student();
		s.shout();
	}

}
