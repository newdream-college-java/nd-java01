
public class Student1 {
	private String name="Ī��";
	private int age=13;
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
	public void print(){
		if(age<15){
			setAge(18);
		}
		System.out.println("��Һã��ҵ����ֽ�"+name+"���ҽ���"+age+"���ˡ�");
	}
}
