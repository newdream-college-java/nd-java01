package zuoye;

public class Student1 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show(){
		System.out.println("ĞÕÃû£º"+getName()+"\tÄêÁä"+getAge());
	}
}
