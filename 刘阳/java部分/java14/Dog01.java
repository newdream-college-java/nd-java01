
public class Dog01 {
	private String name;
	private int health=100;
	private int love=80;
	private String strain="��������������Ȯ";
	public Dog01(){
		
	}
	public Dog01(String name,int health,int love,String strain){
		this.name=name;
		this.health=health;
		this.love=love;
		this.strain=strain;
	}
	
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
		this.health = health;
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
	public void print(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+",����һֻ"+getStrain()+"��");
	}
}
