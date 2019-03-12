package 第14章封装作业;

import java.util.Scanner;

public class TestPenguin02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		//System.out.print("请输入要领养宠物的名字：");
		//String petName=input.next();
		System.out.print("请选择要领养的宠物类型：（1.聪明的拉布拉多犬2.酷酷的雪娜瑞）");
		int petType = input.nextInt();
		if(petType==1){
			Dog01 dog=new Dog01();
			//dog.setName(petName);
			System.out.println("宠物的自白:");
			dog.printMessage();
		}else{
			Penguin02 penguin = new Penguin02();
			System.out.print("请选择企鹅的性别：(1.Q仔2.Q妹)");
			int choiceSex = input.nextInt();
			if(choiceSex==1){
				penguin.setSex(penguin.sex_male);
			}else{
				penguin.setSex(penguin.sex_female);
			}
			System.out.println("宠物的自白:");
			penguin.show();
		}
	}
}
