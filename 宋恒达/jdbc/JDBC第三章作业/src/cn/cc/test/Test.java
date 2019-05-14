package cn.cc.test;

import java.util.Scanner;

import cn.cc.dao.PetTypeDao;
import cn.cc.entity.Master;
import cn.cc.manager.MasterManager;
import cn.cc.manager.PetTypeManager;
import cn.cc.manager.StudentManager;

/**
* @author mob
* @version 2019年5月13日 下午7:44:26
* @description 测试类
*/
public class Test {
	public static void main(String[] args) {
//		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
//		System.out.println("---- 欢迎登录  -----");
//		System.out.print("请输入登录名:");
//		String name=input.next();
//		System.out.print("请输入密码:");
//		String password=input.next();
//		MasterManager manager=new MasterManager();
//		if(manager.login(name,password)) {
//			System.out.println("登录成功！");
//		}else {
//			System.out.println("登录失败！");
//		}
//		System.out.println("请输入宠物类型：狗狗|企鹅|猫咪");
//		String name=input.next();
//		PetTypeManager petTypeManager=new PetTypeManager();
//		int id=petTypeManager.findId(name);
//		if(id!=-1) {
//			System.out.println(name+"的类型编号是"+id);
//		}else {
//			System.out.println("类型名称输入错误！");
//		}
		StudentManager studentManager=new StudentManager();
		System.out.print("请输入修改的id");
		int id=input.nextInt();
		System.out.println("请输入修改后的名字");
		String name=input.next();
		if(studentManager.updateById(id, name)) {
			System.out.println("修改成功");
		}
		System.out.println(studentManager.getAll());
	}
}
