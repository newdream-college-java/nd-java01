package zuoye;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String zy;
	public Student2(String name,int age){
		sex="��";
		zy="�������";
	}
	public Student2(String name,int age,String sex,String zy){
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
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public void show(){
		System.out.println("������"+getName()+"\t����"+getAge()+"\t�Ա�"+getSex()+"\tרҵ��"+getZy());

	}
}
