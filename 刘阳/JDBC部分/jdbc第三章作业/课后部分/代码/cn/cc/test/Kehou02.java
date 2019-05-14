package cn.cc.test;

import java.util.Scanner;

import cn.cc.dao.StudentDao;
import cn.cc.dao.impl.StudentDaoImpl;
import cn.cc.entity.Student;

public class Kehou02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要修改的id：");
		int uid=input.nextInt();
		System.out.println("请输入要修改为什么名字：");
		String uname=input.next();
		Student stu=new Student();
		stu.setId(uid);
		stu.setName(uname);
		
		StudentDao sd=new StudentDaoImpl();
		int re=sd.update(stu);
		if(re!=0) {
          System.out.println("更新数据成功！！！");
      }
	}

}
