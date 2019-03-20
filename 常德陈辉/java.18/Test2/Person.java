package Test2;


public class Person {
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex)throws Exception {
		if(!sex.equals("男")&&!sex.equals("女")){
			throw new Exception("性别错误");
		}
		this.sex=sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age)throws Exception {
		if(age<1||age>100){
			throw new Exception("年龄必须在1到100之间！");
		}
		this.age=age;
	}
	public void print(){
		System.out.println(name+"("+sex+","+age+")");
	}
}
