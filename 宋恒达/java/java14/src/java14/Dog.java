package java14;
/**
 * �����������˼�룬��������Ϣ�б��г����Dog��Penguin
 * 
 * ��װ�������е��������ԣ�˽�л����ṩ���е�set��get��������
 * �������м����жϣ�������ֵ�÷�Χ1-100�������ƺ�
 * ���ÿ��������������������ͼ
 * @author mo
 *
 */
public class Dog {
	private String name="������";
	private int health=100;
	private int love=80;
	private String strain="��������������";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health>=1&&health<=100) {
			this.health=health;
		}
		this.health = 100;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void print() {
		System.out.println("������԰�:");
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealth()+",�����ε����ܶ���"+getLove()+"����һֻ"+getStrain());
	}
}
