package java14;

public class Teacher {
	String name;
	char sex;
	int age;
	static String js;
	public Teacher(String name, int age) {
		// TODO Auto-generated constructor stub
			setName(name);
			setAge(age);
			setSex('男');
			setJs("软件工程");
	}
	public Teacher(String name,int age,char sex,String js){
		setName(name);
		setAge(age);
		setSex(sex);
		setJs(js);
}
	/*public Teacher(String name,int age){
		name="一道光";
		age=25;		
	}*/
	public void Stundent2(String name,int age,char old,String zy){
		setName(name);
		setAge(age);
		setSex('男');
		setJs(js);
	}
	public void show(){
		System.out.println("我的名字叫"+name+"我的年龄是"+age+"我的性别是"+sex+"我的专业是"+js);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJs() {
		return js;
	}
	public void setJs(String js) {
		this.js = js;
	}
	
}
