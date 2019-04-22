package zuoye;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		System.out.print("请选择要领养的宠物的名字：");
		String name=input.next();
		System.out.print("请选择要领养的宠物类型:(1,狗狗2,企鹅3,猪）");
		int a=input.nextInt();
		Dog dog=new Dog();
		Pig pig=new Pig();
		Penguin penguin=new Penguin();
		if(a==1){
			System.out.print("请选择狗狗的品种：(1，聪明的拉布拉多2，酷酷的雪娜瑞）");
			int b=input.nextInt();
			if(b==1){
				dog.setName(name);
				System.out.println("宠物的自白：");
				dog.printDog();
			}else{
				System.out.println("宠物的自白：");
				dog.printDog();
			}
		}else if(a==2){
			System.out.print("请选择狗狗的品种：(1，Q仔2，Q妹）");
			int b=input.nextInt();
			if(b==1){
				penguin.setName(name);
				System.out.println("宠物的自白：");
				penguin.print();
			}else{
				System.out.println("宠物的自白：");
				penguin.print();
			}
		}else{
			System.out.print("请选择猪毛的颜色：(1，白2，黑）");
			int b =input.nextInt();
			pig.setName(name);
			if(b==1){
				pig.setColor("白");
			}else{
				pig.setColor("黑");
			}
			System.out.println("宠物的自白：");
			pig.print();
		}
	}

}
