package cn.cc.test;
import java.util.Scanner;

import cn.cc.manager.PeTypeManager;
public class test03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PeTypeManager pn=new PeTypeManager();
		System.out.println("请输入宠物类型：狗狗|\t企鹅|\t猫咪");
		String name=input.next();	
		int id=pn.findId(name);
		if(id!=0) {
			System.out.println(name+"的类型编号是"+id);
		}else{
			System.out.println("类型输入错误");
		}
	}
}
