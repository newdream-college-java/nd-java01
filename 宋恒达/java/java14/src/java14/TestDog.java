package java14;

import java.util.Scanner;
/**
 * 根据控制台的提示信息领养宠物，输入昵称
 * 品种等信息，然后打印宠物信息表示领养成功
 * @author mo
 *
 */
public class TestDog {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎您来到宠物店!");
		System.out.print("请输入要领养宠物的名字:");
		String name=input.next();
		System.out.print("请选择要领养的宠物类型：（1、狗狗 2、企鹅 3、猪）");
		int type=input.nextInt();
		if(type==1) {
			Dog dog=new Dog();
			dog.setName(name);
			System.out.print("请选择狗狗的品种：（1、聪明的拉布拉多犬 2、酷酷的雪瑞娜）");
			int strain=input.nextInt();
			if(strain==1) {
				dog.setStrain("聪明的拉布拉多犬");
			}else if(strain==2) {
				dog.setStrain("酷酷的雪瑞娜");
			}
			dog.print();
		}else if(type==2) {
			Penguin penguin=new Penguin();
			penguin.setName(name);
			System.out.print("请选企鹅的性别：（1、公 2、母）");
			int strain=input.nextInt();
			if(strain==1) {
				penguin.setSex("公");
			}else if(strain==2) {
				penguin.setSex("母");
			}
			penguin.print();
		}else if(type==3) {
			Pig pig=new Pig();
			pig.setName(name);
			System.out.print("请选猪的毛发颜色：（1、白 2、黑）");
			int color=input.nextInt();
			if(color==1) {
				pig.setColor("白");
			}else if(color==2) {
				pig.setColor("黑");
			}
			pig.print();
		}
		
	}
}
