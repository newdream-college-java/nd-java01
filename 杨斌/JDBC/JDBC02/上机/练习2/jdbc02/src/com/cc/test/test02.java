package com.cc.test;

import java.util.Scanner;

import com.cc.dao.DogDaoImpl;
import com.cc.dao.impl.MasterDaoImpl;
import com.cc.entity.Master;

public class test02 {
	public static void main(String[] args) {
		Master ms=new Master();
		MasterDaoImpl md=new MasterDaoImpl();
		Scanner input=new Scanner(System.in);
		System.out.println("宠物主人登录");
		System.out.println("请输入姓名");
		String name=input.next();
		ms.setName(name);
		System.out.println("请输入密码");		
		String password=input.next();
		ms.setPassword(password);
		Master result=md.findmaster(ms);
		DogDaoImpl dog =new DogDaoImpl();
		if(result!=null) {
			System.out.println("登录成功，欢迎您");
			boolean goOn;
			do {
				goOn=true;
				System.out.println("============================欢迎访问宠物商店============================");
				System.out.println("1.添加宠物信息\t2.修改宠物信息\t3.查询宠物信息\t4.添加主人信息\t0.退出");
				System.out.println("请输入您的选择:");
				int num=input.nextInt();
				switch(num) {
					case 3:
						System.out.println("宠物商店>查询宠物");
						dog.selectDog();
						break;
					case 0:
						System.out.println("谢谢您的光临！再见");
						goOn=false;
						break;
//					case 2:
//						System.out.println("宠物商店>修改宠物信息");
//						t1.updateMaster();
//						break;
					default:
						System.out.println("您的选择有误");
						break;
				}
			}while(goOn);
		}else {
			System.out.println("用户名或密码错误，登录失败");
		}
	}
}
