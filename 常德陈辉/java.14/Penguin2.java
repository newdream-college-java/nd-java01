package zuoye;

import java.util.Scanner;

public class Penguin2 {
	private String name="������";
	private int health=100;
	private int love=80;
	private String sex="Q ��";
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	static final String SEX_MALE="Q ��";
	static final String SEX_FEMALE="Q ��";
	public void print(){
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ�������Ա𣺣�1��Q��2��Q�ã�");
		int a=input.nextInt();
		if(a==1){
			sex=SEX_MALE;
		}else{
			sex=SEX_FEMALE;
		}
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealth()+",�����˵����ܶ���"+getLove()+",����һֻ"+getSex());
	}
	
}
