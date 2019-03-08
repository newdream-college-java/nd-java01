package 作业;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String speciality;
	public Student2(String name,int age){
		setSex("男");
		setSpeciality("软件工程");
		setName(name);
		setAge(age);
	}
	public Student2(String name,int age,String sex,String speciality){
		setName(name);
		setAge(age);
		setSex(sex);
		setSpeciality(speciality);
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
	public void setAge(int age) {
		if(age<15){
			age=18;
			this.age = age;
		}else{
			this.age = age;
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public void show(){
		System.out.println("自我介绍");
		System.out.println("我叫："+getName()+"，年龄是："+getAge()+"，性别："+getSex()+"，专业是："+getSpeciality());
	}

}
