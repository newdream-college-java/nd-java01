import java.util.Scanner;


public class Dog02 {
	private String name="������";
	private int health;
	private int love;
	private String strain="��������������Ȯ";
	public Dog02(){
		
	}
	public Dog02(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	public void choicestrain(){
		System.out.println("��ѡ�񹷹���Ʒ�֣���1����������������Ȯ   2������ѩ����");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		switch(a){
			case 1:
				//setStrain("��������������Ȯ");�Լ��������˽�������Լ�����ʹ�á�
				strain="��������������Ȯ";
				break;
			case 2:
				strain=("����ѩ����");
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
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void show(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ"+strain+"��");
	}
}
