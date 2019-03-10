package java14;
import java.util.Scanner;
public class Qqie {
		private String name="无名氏";
		private int health=100;
		private int love =80;
		private String set="Q仔";
		public void show1(){
			Scanner input=new Scanner(System.in);
			System.out.println("请选择企鹅的品种1：聪明的Q仔， 2：酷酷的雪瑞企鹅");
			int q=input.nextInt();
			if(q==1){
				System.out.println("选择的是聪明的企鹅");
			}else if(q==2){
				System.out.println("选择的是酷酷的Q仔企鹅");
			}else{
				System.out.println("选择错误");
			}
			System.out.print("我的名字叫："+name+"健康值是："+health+"和主人的亲密度为："+love+"我是一只聪明的企鹅"+set);
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
