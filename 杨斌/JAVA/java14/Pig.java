import java.util.Scanner;
public class Pig {
	private String name;
	private int health=100;
	private int love=80;
	private String clolr;
	public Pig (){
		
	}
	public Pig (String name,String clolr){
		setName(name);
		setClolr(clolr);
	}
	public void print(){
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ�����ë����ɫ����1����ɫ2����ɫ");
		int a=input.nextInt();
		if(a==2){
			setClolr("��ɫ");
		}
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"���ҵ�ë����ɫ��"+clolr);
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
	public String getClolr() {
		return clolr;
	}
	public void setClolr(String clolr) {
		this.clolr = clolr;
	}
}
