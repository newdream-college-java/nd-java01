package ��ҵ;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String speciality;
	public Student2(String name,int age){
		setSex("��");
		setSpeciality("�������");
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
		System.out.println("���ҽ���");
		System.out.println("�ҽУ�"+getName()+"�������ǣ�"+getAge()+"���Ա�"+getSex()+"��רҵ�ǣ�"+getSpeciality());
	}

}
