package 第13章作业;

import java.util.Scanner;

public class StudentBiz {
	Scanner input =new Scanner(System.in);
	Student[] stus = new Student[5];
	public void addStudent(Student stu){
	 //假设没满	boolean flag=true;
		for(int i=0;i<stus.length;i++){
			if(stus[i]==null){
				stus[i]=stu;
				break;
			}
			//如果数组存满了
			if(i==stus.length-1){
				//数组存满了
				break;
			}
		}
	}
	public void showStudent(){
		System.out.println("************************\n\n\t客户姓名列表：");
		System.out.println("************************");
		for(int i=0;i<stus.length;i++){
			if(stus[i]!=null){
				//输出的时候不能直接输出对线数组stus[i],要输出对象数组的属性
				System.out.print(stus[i].name+"\t");
			}
		}
	
	}
	public void xiugai(){
		System.out.print("\n请输入要修改客户的姓名：");
		String name =input.next();
		for(int i=0;i<stus.length;i++){
			if(name.equals(stus[i].name)){
				System.out.print("请输入新的客户姓名");
				stus[i].name=input.next();
				System.out.println("\n**********修改结果***************");
				System.out.println("\t找到并成功！");
				showStudent();
				break;
			}else{
				System.out.println("\n**********修改结果**********");
				System.out.print("没有找到，修改失败");
			}
		}
	}
}
