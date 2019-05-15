package cn.two.test;

import java.util.Scanner;

import cn.two.entity.Dog;
import cn.two.entity.Master;
import cn.two.manager.DogManager;
import cn.two.manager.MasterManager;

public class TestMaster {
	public static void main(String[] args) {
		Master master=new Master();
		Dog dog=new Dog();
		Scanner input=new Scanner(System.in);
		System.out.println("----欢迎光临宠物乐园----");
		System.out.print("请输入登录名：");
		master.setName(input.next());
		System.out.print("请输入登录密码：");
		master.setPassword(input.next());
		MasterManager m=new MasterManager();
		DogManager dogs=new DogManager();
		m.select(master);
		if(m.select(master)==true) {
			System.out.println("=============欢迎来到宠物商店==============");
			System.out.println("1.添加宠物信息 2.修改宠物信息 3.查询宠物信息 4.添加主人信息 0.退出");
			System.out.println("==========================================================");
			System.out.println("请输入您的选择：");
			int a=input.nextInt();
			switch(a) {
				case 1:
					System.out.println("宠物商店>添加宠物信息");
					dogs.save(dog);
					break;
				case 2:
					System.out.println("宠物商店>修改宠物信息");
					dogs.updateDog(dog);
					break;
				case 3:
					System.out.println("宠物商店>查询宠物信息");
					System.out.println("\t\t\t宠物信息列表");
					System.out.println("\t\t编号\t\t姓名\t\t品种");
					dogs.selectDog();
					break;
				case 4:
					System.out.println("宠物商店>添加主人信息");
					m.save(master);
					break;
				case 0:
					System.out.println("欢迎下次光临");
					break;
				default:
					System.out.println("输入错误！！");
					break;
			}
		}
	}
}
