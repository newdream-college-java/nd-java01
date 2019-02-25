/**
**进入系统主菜单后，提示用户输入数字，根据选择进入相应模块
**用户若输入错误，要求重复输入，直到输入正确，执行相应功能后退出循环
**/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		boolean flag=true;
		Scanner input=new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.购物结算");
		System.out.println("\t3.真情回馈");
		System.out.println("\t4.注销");
		System.out.println("*************************************");
		System.out.println();
		System.out.println();
		System.out.print("请选择,输入数字:");
		do{
				int a=input.nextInt();
				if((a>=1)&&(a<=4)){
					System.out.println("执行购物结算");
					System.out.println("程序结束");
					flag=false;
				}else{
					System.out.print("输入错误,请重新输入数字:");
					continue;
				}	
		}while(flag);
	}
}