public class Stundent2 {
	private String name;
	private int age;
	private char old;
	private String zy;
	public Stundent2(String name,int age){
		setOld('男');
		setZy("软件工程");
		setName(name);
		setAge(age);
	}
	public Stundent2(String name,int age,char old,String zy){
		setName(name);
		setAge(age);
		setOld(old);
		setZy(zy);
	}
	public void show(){
		System.out.println("我的名字叫"+name+"我的年龄是"+age+"我的性别是"+old+"我的专业是"+zy);
		
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
		return old;
	}
	public void setOld(char old) {
		this.old = old;
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
