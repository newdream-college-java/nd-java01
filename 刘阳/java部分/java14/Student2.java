
public class Student2 {
	private String name="����";
	private int age=13;
	private String sex="��";
	private String zy="���ѧ";
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
	public Student2(String sex,String zy,String name,int age){
		this.sex=sex;
		this.zy=zy;
		this.name=name;
		this.age=age;
	}
	public Student2(String name,int age){
		sex="��";
		zy="�������";
		this.name=name;
		this.age=age;
	}
	public void print(){
		System.out.println("��Һã��ҵ����ֽ�"+name+"���Ա�"+sex+"���ҽ���"+age+"��,ѧ��"+zy+"רҵ");
	}
}
