package ��ʮ������ҵ;

public class Teacher4 {
	private String name;
	private String sex;
	private int age;
	private String zy;
	final static private String jsfx="JAVA";
	final static private String cs="����";
	final static private String az="��׿����";
	public Teacher4(String name,int age,String zy){
		this.age=age;
		this.zy=zy;
		System.out.println("����Ϊ��"+name+"����Ϊ��"+age+"   �Ա��У�רҵΪ�������");
	}
	public Teacher4(String name,String sex,int age,String zy){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.zy=zy;
		System.out.println("����Ϊ��"+name+"�Ա�Ϊ��"+sex+"����Ϊ��"+age+"רҵΪ��"+zy);
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
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public static String getJsfx() {
		return jsfx;
	}
	public static String getCs() {
		return cs;
	}
	public static String getAz() {
		return az;
	}
}
