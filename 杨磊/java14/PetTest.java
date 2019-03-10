package com.nd.zuoye.yl;

import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		System.out.println("请输入宠物的名字：");
		String name = input.next();
		System.out.println("请选择你要选择的宠物类型（1.狗狗 2.企鹅 3.猪）");
		int number = input.nextInt();
		switch(number){
			case 1:
				System.out.println("请选择狗狗的品种（1.聪明的拉布拉多犬 2.酷酷的雪拉瑞）");
				int type = input.nextInt();
				String strain = "";
				switch(type){
					case 1:
						strain ="聪明的拉布拉多犬";
						break;
					case 2:
						strain ="酷酷的雪拉瑞";
						break;
				}
					Dog d = new Dog(name,strain);
					d.print();
					break;
			case 2:
				System.out.println("请选择企鹅的性别（1.Q仔 2.Q妹）");
				int s = input.nextInt();
				String sex = null;
				switch(s){
					case 1:
						sex = Penguin.SEX_MALE;
						break;
					case 2:
						sex = Penguin.SEX_FEMALE;
						break;
				}
				Penguin p = new Penguin(name,sex);
				p.print();
			case 3:
				System.out.println("请选择猪的毛皮颜色：（1.白 2.黑）");
				int m =input.nextInt();
				String maopi = null;
				switch(m){
					case 1:
						maopi = "白色";
						break;
					case 2:
						maopi = "黑色";
						break;
				}
				Pig g = new Pig(name,maopi);
				g.print();
		}

	}

}
