import java.util.Scanner;


public class Penguin02 {
	private String name="������";
	private int health;
	private int love;
	private String sex="Q��";
	static final String SEX_MALE="Q��";
	static final String SEX_FEMALE="Q��";
	public Penguin02(){
		
	}
	public Penguin02(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	public void choicestrain(){
		System.out.println("��ѡ�������Ա𣺣�1��Q��  2��Q�ã�");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		switch(a){
			case 1:
				sex=SEX_MALE;
				break;
			case 2:
				sex=SEX_FEMALE;
				break;
		}
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
	public void show(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ"+sex+"��");
	}
}
