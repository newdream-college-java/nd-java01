import java.util.Scanner;


public class Pig {
	private String name="������";
	private int health=100;
	private int love=80;
	private String color="��";
	public Pig(){
		
	}
	public Pig(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	public void choicestrain(){
		System.out.println("��ѡ���������ɫ����1����  1���ڣ�");
		Scanner input=new Scanner(System.in);
		switch(input.nextInt()){
			case 1:
				color="��";
				break;
			case 2:
				color="��";
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void show(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ��"+color+"��");
	}
}
