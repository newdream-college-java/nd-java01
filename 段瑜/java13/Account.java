package 作业;

import java.util.Scanner;

public class Account {
	int moneys;
	public int show(int money){
		Scanner input=new Scanner(System.in);
		moneys=money;
		return moneys;
		
	}
	public void show1(){
		System.out.println("1.存款\t2.取款\t0.退出");
		System.out.print("请选择你需要办理的业务：");
	}
	
}
