package 作业;

import java.util.Scanner;

public class Test3Biz {
	public static void main(String[] args){
		GustomerBiz a=new GustomerBiz();
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.names.length;i++){
			System.out.println("输入第"+(i+1)+"名学生的姓名：");
			String name=input.next();
			a.show(name);
		}
		a.show1();
		System.out.println();
		System.out.print("请输入需要修改的学生姓名：");
		String name1=input.next();
		System.out.print("请输入新的学生姓名：");
		String name2=input.next();
		for (int i = 0; i < a.names.length; i++) {
			System.out.println("*******修改结果************");
			if(a.names[i].equals(name1)){
				a.names[i]=name2;
				System.out.println("找到并且修改成功");
				System.out.println("*************************");
				break;
			}else{
				System.out.println("未找到修改失败");
				System.out.println("*************************");
			}
		}
		System.out.println();
		a.show1();
		
	}
}
