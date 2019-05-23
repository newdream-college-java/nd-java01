package 作业;

import java.util.Scanner;

public class Dog2 {

	
		private  String name;
		private  int love;
		private  int health;
		private  String strain;
		public Dog2(){
			
		}
		public Dog2(String name){
			setName(name);
			
		}
		public void setName(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		public void setHealth(int health){
			this.health=health;
		}
		public int getHealth(){
			return health;
		}
		public void setLove(int love){
			this.love=love;		
		}
		public int getLove(){
			return love;
		}
		public void setStrain(String strain){
			this.strain=strain;
		}
		public String  getStrain(){		
			return strain;
		}
		public void show(){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入选择狗狗的品种：(1.拉布拉多 2.雪纳瑞)");
			int a=input.nextInt();
			if(a==1){
				strain="我是一只聪明的拉布拉多";
			}else{
				strain="我是一只酷酷的雪纳瑞";
			}
			switch(a){
				case 1:
					System.out.println("宠物的自白：\n我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，"+getStrain());
					break;
				case 2:
					System.out.println("宠物的自白：\n我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，"+getStrain());
					break;
				default:
					break;
			}
		
	}

}
