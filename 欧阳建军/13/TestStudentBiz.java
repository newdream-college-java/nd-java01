package 第13章作业;

import java.util.Scanner;

public class TestStudentBiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentBiz sb = new StudentBiz();
		for(int i=0;i<sb.stus.length;i++){
			
			Student stu =new Student();
			System.out.print("请输入学生姓名");
			stu.name=input.next();
			sb.addStudent(stu);
		}
		sb.showStudent();
		sb.xiugai();
	}
}
