package java14;

public class Student2 {
	private String name;
	private int age;
	private char od;
	private String zy;
	public Student2(String name, int age, char od, String zy) {
		// TODO Auto-generated constructor stub
			setName("旺财");
			setAge(23);
			setOld('男');
			setZy("计算机");
	}
	public void Stundent2(String name,int age){
		setOld('男');
		setZy("软件工程");
		setName(name);
		setAge(age);
	}
	public void Stundent2(String name,int age,char old,String zy){
		setName(name);
		setAge(age);
		setOld(old);
		setZy(zy);
	}
	public void show(){
		System.out.println("我的名字叫"+name+"我的年龄是"+age+"我的性别是"+od+"我的专业是"+zy);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		
		return age;
	}
	public char getOld() {
		return od;
	}
	public void setOld(char od) {
		this.od = od;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public void setAge(int age) {
			this.age =age;
			
	}
		
	

}
