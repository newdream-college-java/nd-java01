package zuoye;

public class Teacher {
	private String name;
	private String sex;
	private int age;
	private String jx;
	static final String JAVA="Java ����";
	static final String cs="���� ����";
	static final String ANDROID="android ����";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJx() {
		return jx;
	}
	public void setJx(String jx) {
		this.jx = jx;
	}
	public Teacher(String name,int age){
		sex="��";
		jx="�������";
		this.name=name;
		this.age=age;
	}
	public Teacher(String name,String sex,int age,String jx){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.jx=jx;
	}
	public void show(){
		System.out.println("������"+getName()+"  �Ա�"+getSex()+"  ���䣺"+getAge()+"  רҵ��"+getJx());
	}
}
