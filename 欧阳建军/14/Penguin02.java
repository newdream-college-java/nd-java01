package ��14�·�װ��ҵ;

public class Penguin02 {
	private String name;
	private int health;
	private int love;
	static final String sex_male="Q��";
	static final String sex_female="Q��";
	private String sex;
	public Penguin02(){
		name="������";
		health=100;
		love=80;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	public void show(){
		System.out.print("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealth()+",�����˵����ܶ���"+getLove()+",����һֻ"+getSex()+"��");
	}
}
