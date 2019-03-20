package Test1;

import java.util.Scanner;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入课程代号（1~3之间的数字）：");
		try{
			int a=input.nextInt();
			switch(a){
				case 1:
					System.out.println("C#编程");
					break;
				case 2:
					System.out.println("JAVA 编程");
					break;
				case 3:
					System.out.println("SQL 基 础");
					break;
				default:
					System.out.println("您输入有误！没有对应的课程");
			}
			
		}catch(Exception e){
			System.out.println("您输入有误！没有对应的课程");
		}finally{
			System.out.println("欢迎提出建议！");
		}
	}

}
