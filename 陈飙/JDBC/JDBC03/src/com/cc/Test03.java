package com.cc;

import java.util.Scanner;

import com.cc.manager.PetTypeManager;

public class Test03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("--------��ӭ���ٳ�����԰--------");
		System.out.println("������������ͣ�����|���|è��");
		String name=input.next();
		PetTypeManager pet=new PetTypeManager();
			int id=pet.findId(name);
		if(id!=0){
			System.out.println(name+"�����ͱ����"+id);
		}else{
			System.out.println("���������������");
		}
	}

}
