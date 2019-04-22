package 第18章异常作业1_2;

public class Person {
	private	int age;
	private String name;
	private String sex;
	public Person(){
		
	}
	public Person(String name,String sex,int age){
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		if(age>100||age<1){
			throw new Exception("年龄的范围为1-100");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) throws Exception {
		if(!sex.equals("男")&&!sex.equals("女")){
			throw new Exception("性别输入错误");
		}
		this.sex = sex;
	}
	public void showinfo(){
		System.out.println(name+"("+sex+","+age+"岁)");
	}
	
}
