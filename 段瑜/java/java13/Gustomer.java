package 作业;

import java.util.Scanner;

public class Gustomer {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		GustomerBiz a=new GustomerBiz();
		String yn;
		int i=0;
		do{
			System.out.println("输入第"+(i+1)+"名学生的姓名：");
			String name=input.next();
			a.show(name);
			System.out.print("是否继续录入（y/n）：");
			a.yn=input.next();
			i++;
		}while(a.yn.equals("y")&&i<a.names.length);
		a.show1();
	}

}
