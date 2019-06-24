package java14;
import java.util.Scanner;
public class Gou {
		private String name="无名氏";
		private int health=100;
		private int love=80;
		private String Strain="拉布拉多犬";
		public void show(){
			Scanner b=new Scanner(System.in);
			System.out.println("请选择狗狗的品种1：聪明的拉布拉多犬 ，2：酷酷的雪娜瑞");
			int po=b.nextInt();
			if(po==1){
				System.out.println("选择的是聪明的拉布拉多");
			}else if(po==2){
				System.out.println("选择的是酷酷的雪娜瑞");
				setName("酷酷的雪娜瑞");
			}else{
				System.out.println("选择错误");
			}
			System.out.print("我的名字叫："+name+"健康值是："+health+"和主人的亲密度为："+love+"我是一只"+ Strain);
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
