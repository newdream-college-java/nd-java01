package ��14�·�װ��ҵ;

public class Penguin03 {
	String name;
	int health;
	int love;
	static final String sex_male="Q��";
	static final String sex_female="Q��";
	private String sex;
	public Penguin03(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void show(){
		System.out.print("�ҵ����ֽ�"+name+",����ֵ��"+health+",�����˵����ܶ���"+love+","+"����һֻ"+getSex()+"��");
	}
}
