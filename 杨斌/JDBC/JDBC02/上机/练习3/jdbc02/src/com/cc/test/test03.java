package com.cc.test;

import java.util.Scanner;

import com.cc.dao.DogDao;
import com.cc.dao.DogDaoImpl;
import com.cc.dao.impl.MasterDaoImpl;
import com.cc.entity.Master;

public class test03 {
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
				    case 1:
				    	System.out.println("宠物商店>添加宠物信息");
				    	System.out.println("请输入宠物名字:");
						String ename=input.next();
						System.out.println("请输入宠物的健康值:");
						int health=input.nextInt();
						System.out.println("请输入宠物的喜悦度:");
						int love=input.nextInt();
						System.out.println("请输入宠物的类型:");
						String strain=input.next();
						String sql="insert into dog values(null,?,?,?,?)";					
						Object[] objects= {ename,health,love,strain};
						int resu=dog.executeUpdate(sql,objects);
						if(resu>0) {
							System.out.println("插入狗狗信息成功");
						}
						break;
					case 2:
						System.out.println("宠物商店>修改宠物信息");
				    	System.out.println("请输入需要修改健康值的宠物名字:");
						String ename01=input.next();
						System.out.println("请输入修改后的健康值（1-100）");
						int health01=input.nextInt();
						String sql01="update dog set health=? where name=?";					
						Object[] objects01= {health01,ename01};
						int resu01=dog.executeUpdate(sql01,objects01);
						if(resu01>0) {
							System.out.println("添加主人信息成功");
						}
						break;
					case 3:
						System.out.println("宠物商店>查询宠物");
						dog.selectDog();
						break;
					case 4:
						System.out.println("宠物商店>添加主人信息");
						System.out.println("请输入主人姓名:");
						String mname=input.next();
						System.out.println("请输入主人的密码:");
						String pass=input.next();
						System.out.println("请输入主人的元宝:");
						int money=input.nextInt();
						String sql02="insert into master values(null,?,?,?)";					
						Object[] objects02= {mname,pass,money};
						int resu02=dog.executeUpdate(sql02,objects02);
						if(resu02>0) {
							System.out.println("插入狗狗信息成功");
						}
						break;
					case 0:
						System.out.println("谢谢您的光临！再见");
						goOn=false;
						break;

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
