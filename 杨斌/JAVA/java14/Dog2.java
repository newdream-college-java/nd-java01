import java.util.Scanner;
public class Dog2 {
	private String name;
	private int health=100;
	private int love=80;
	private String strain;
	public Dog2(){
		
	}
	public Dog2(String name,String strain){
		setName(name);
		setStrain(strain);
	}
	public void print(){
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ�񹷹���Ʒ�֣���1����������������Ȯ2������ѩ����");
		int a=input.nextInt();
		if(a==2){
			setStrain("����ѩ����");
		}
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ"+strain);
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
		if(100>=health&&health>=1){
			this.health = health;
		}else{
			System.out.println("����Ľ���ֵ");
		}
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
}