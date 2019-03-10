package 第十四章作业;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		System.out.println("请输入要领养宠物的名字：");
		String name=input.next();
		System.out.println("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		int a=input.nextInt();
		if(a==1){
			System.out.println("请选择狗狗的品种:(1/聪明的拉布拉多 2、酷酷的雪纳瑞)");
			int b=input.nextInt();
			if(b==1){
				System.out.println("宠物的自白：");
				Dog dog=new Dog(name,100,80,"聪明的拉布拉多");
			}if(b==2){
				System.out.println("宠物的自白：");
				Dog dog=new Dog(name,100,80,"酷酷的雪纳瑞");
			}
		}
		if(a==2){
			System.out.println("请选择狗狗的品种:(1/qq企鹅 2、QQ企鹅)");
			int b=input.nextInt();
			if(b==1){
				System.out.println("宠物的自白：");
				Dog dog=new Dog(name,100,80,"qq企鹅");
			}if(b==2){
				System.out.println("宠物的自白：");
				Dog dog=new Dog(name,100,80,"QQ企鹅");
			}
		}
	}

}
