package ��ҵ;

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
			System.out.println("������ѡ�񹷹���Ʒ�֣�(1.�������� 2.ѩ����)");
			int a=input.nextInt();
			if(a==1){
				strain="����һֻ��������������";
			}else{
				strain="����һֻ����ѩ����";
			}
			switch(a){
				case 1:
					System.out.println("������԰ף�\n�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"��"+getStrain());
					break;
				case 2:
					System.out.println("������԰ף�\n�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"��"+getStrain());
					break;
				default:
					break;
			}
		
	}

}
