package java14;

public class Student2 {
	private String name;
	private int age;
	private char od;
	private String zy;
	public Student2(String name, int age, char od, String zy) {
		// TODO Auto-generated constructor stub
			setName("����");
			setAge(23);
			setOld('��');
			setZy("�����");
	}
	public void Stundent2(String name,int age){
		setOld('��');
		setZy("�������");
		setName(name);
		setAge(age);
	}
	public void Stundent2(String name,int age,char old,String zy){
		setName(name);
		setAge(age);
		setOld(old);
		setZy(zy);
	}
	public void show(){
		System.out.println("�ҵ����ֽ�"+name+"�ҵ�������"+age+"�ҵ��Ա���"+od+"�ҵ�רҵ��"+zy);
		
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
	public char getOld() {
		return od;
	}
	public void setOld(char od) {
		this.od = od;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public void setAge(int age) {
			this.age =age;
			
	}
		
	

}
