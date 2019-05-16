package com.cc;

import java.util.Scanner;

import com.cc.manager.PetTypeManager;

public class Test03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("--------欢迎光临宠物乐园--------");
		System.out.println("请输入宠物类型：狗狗|企鹅|猫咪");
		String name=input.next();
		PetTypeManager pet=new PetTypeManager();
			int id=pet.findId(name);
		if(id!=0){
			System.out.println(name+"的类型编号是"+id);
		}else{
			System.out.println("类型名称输入错误！");
		}
	}

}
