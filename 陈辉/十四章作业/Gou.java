package java14;
import java.util.Scanner;
public class Gou {
		private String name="������";
		private int health=100;
		private int love=80;
		private String Strain="��������Ȯ";
		public void show(){
			Scanner b=new Scanner(System.in);
			System.out.println("��ѡ�񹷹���Ʒ��1����������������Ȯ ��2������ѩ����");
			int po=b.nextInt();
			if(po==1){
				System.out.println("ѡ����Ǵ�������������");
			}else if(po==2){
				System.out.println("ѡ����ǿ���ѩ����");
				setName("����ѩ����");
			}else{
				System.out.println("ѡ�����");
			}
			System.out.print("�ҵ����ֽУ�"+name+"����ֵ�ǣ�"+health+"�����˵����ܶ�Ϊ��"+love+"����һֻ"+ Strain);
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
			return Strain;
		}
		public void setStrain(String strain) {
			Strain = strain;
		}
	

}
