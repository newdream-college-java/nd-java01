package ��ҵ.Test2;

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
			System.out.println("���������1��100֮��");
		}
		this.age = age;
	}
	public void setSex(String sex) throws Exception{
		if(sex.equals("��")&&sex.equals("Ů")){
			System.out.println("�Ա�����ǡ��С����ߡ�Ů��");
		}
		this.sex = sex;
	}
	public void print(){
		System.out.println("������"+name+"\t�Ա�"+(sex+"\t����"+age)+"��");
	}
	
}
