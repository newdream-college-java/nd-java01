import java.util.Scanner;
public class Penguin2 {
	private String name;
	private int health=100;
	private int love=80;
	private	String sex;
	static final String SEX_MALE="Q��";
	static final String SEX_FEMALE="Q��";
	public Penguin2(){
		
	}
	public Penguin2(String name,String sex){
		setName(name);
		setSex(sex);
	}
	public void print(){
		Scanner input=new Scanner(System.in);		
		System.out.println("��ѡ�������Ա𣺣�1��Q��2��Q�ã�");
		int b=input.nextInt();
		if(b==1){
			 sex=SEX_MALE;
		}else{
			 sex=SEX_FEMALE;
		}
		
		System.out.println("������԰�");
		System.out.println("�ҵ����ֽ�"+name+"���Ա���"+sex+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ���");
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}

