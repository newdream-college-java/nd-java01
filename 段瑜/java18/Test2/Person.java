package 作业.Test2;

public class Person {
	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) throws Exception{
		if(age<1||age>100){
			System.out.println("年龄必须在1到100之间");
		}
		this.age = age;
	}
	public void setSex(String sex) throws Exception{
		if(sex.equals("男")&&sex.equals("女")){
			System.out.println("性别必须是“男”或者“女”");
		}
		this.sex = sex;
	}
	public void print(){
		System.out.println("姓名："+name+"\t性别："+(sex+"\t姓名"+age)+"岁");
	}
	
}
