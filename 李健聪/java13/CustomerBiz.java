package 第十三章作业;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerBiz {
	Scanner input=new Scanner(System.in);
	String a;
	public void addkh(){
		String[] name=new String[4];
		for(int i=0;i>=0;i++){
			System.out.print("请输入客户的姓名：");
			a=input.next();
			name[i]=a;
			System.out.println("继续输入吗？（y/n）");
			String b=input.next();
			if(b.equals("y")){
				continue;
			}
			else if(b.equals("n")){
				System.out.println("**********************");
				System.out.println("客户姓名列表：");
				System.out.println("**********************");
				System.out.print(Arrays.toString(name));
				
			}
			
		}
	}
	

}
