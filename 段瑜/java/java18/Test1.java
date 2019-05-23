package 作业;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		try{
			System.out.print("名输入课程代号（1~3之间的数字）：");
			int a=input.nextInt();
			switch(a){
				case 1:
					System.out.println("C#编程");
					break;
				case 2:
					System.out.println("JAVA编程");
					break;
				case 3:
					System.out.println("SQL基础");
					break;
				default:
					System.out.println("输入错误！");
					break;
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("欢迎提出建议");
		}
	}
}
