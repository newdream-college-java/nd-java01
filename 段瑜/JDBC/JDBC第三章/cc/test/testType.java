package cn.cc.test;

import java.util.Scanner;

import cn.cc.entity.Type;
import cn.cc.manager.TypeManager;

public class testType {
	public static void main(String[] args) {
		Type type=new Type();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入宠物类型：狗狗|企鹅|猫咪");
		String name=input.next();
		TypeManager pmanager=new TypeManager();
		type.setTypeName(name);
		int id=pmanager.findId(name);
		if(id!=0) {
			System.out.println(name+"的类型编号是："+id);
			
		}else {
			System.out.println("类型名称输入错误！");
		}
	}
}
