
public class Penguin01 {
	private String name;
	private int health=100;
	private int love=80;
	private String sex="Q��";
	public Penguin01(){
		
	}
	public Penguin01(String name,int health,int love,String sex){
		this.name=name;
		this.health=health;
		this.love=love;
		this.sex=sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+",����һֻ"+getSex()+"��");
	}
	
}
