package Test2019_3_8_z14;

import java.util.Scanner;

public class PetShop_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		System.out.print("请输入要领养宠物的名字：");
		String name = input.next();
		String pz  = null;
		System.out.print("请选择要领养宠物的类型（1.狗狗 2.企鹅 3.猪） ");
		int lx = input.nextInt();
		if (lx==1) {
			System.out.print("请输入狗狗的品种：（1.聪明的拉布拉多犬 2.苦苦的雪娜瑞）");
			pz = input.nextInt()==1?"聪明的拉布拉多犬":"苦苦的雪娜瑞";
			Dog_1 dog = new Dog_1();
			dog.print(name, pz);
		}else {
			System.out.print("请输入企鹅的品种：（1.帝企鹅 2.阿德利企鹅）");
			pz = input.nextInt()==1?"帝企鹅":"阿德利企鹅";
			Dog_1 dog = new Dog_1();
			dog.print(name, pz);
		}
	}
}
