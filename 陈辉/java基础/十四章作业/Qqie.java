package java14;
import java.util.Scanner;
public class Qqie {
		private String name="������";
		private int health=100;
		private int love =80;
		private String set="Q��";
		public void show1(){
			Scanner input=new Scanner(System.in);
			System.out.println("��ѡ������Ʒ��1��������Q�У� 2������ѩ�����");
			int q=input.nextInt();
			if(q==1){
				System.out.println("ѡ����Ǵ��������");
			}else if(q==2){
				System.out.println("ѡ����ǿ���Q�����");
			}else{
				System.out.println("ѡ�����");
			}
			System.out.print("�ҵ����ֽУ�"+name+"����ֵ�ǣ�"+health+"�����˵����ܶ�Ϊ��"+love+"����һֻ���������"+set);
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
		public String getSet() {
			return set;
		}
		public void setSet(String set) {
			this.set = set;
		}
	
}
