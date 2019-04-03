package Test2019_3_5_z12;

import java.util.Scanner;

public class Game {
	//欢迎界面
	static int count = 0;
	static int count2 = 0;
	static int count3 = 0;
	public static void hy(){
		System.out.println("------------欢迎进入游戏世界------------\n\n");
		System.out.println("\t******************");
		System.out.println("\t**\t猜拳开始\t**");
		System.out.println("\t******************");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
		System.out.print("请选择对方角色：（1：刘备 2：孙权 3：曹操）：");
	}
	//选择电脑角色
	public static String js(){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n>3&&n<1) {
			System.out.print("请重新选择对方角色：（1：刘备 2：孙权 3：曹操）：");			
			n = input.nextInt();
		}
		if (n==1) {
			return "刘备";
		}else if (n==2) {
			return "孙权";
		}else {
			return "曹操";
		}
	}
	//是否开始猜拳
	public static void ks(){
		Scanner input = new Scanner(System.in);
		String k ;
		User use = new  User();
		Computer com = new  Computer();
		com.name=js();
		do {
			System.out.print("\n要开始吗？（y/n）");
			k = input.next();
			while (!k.equals("y")&&!k.equals("n")) {
			System.out.print("要开始吗？（y/n）");
			k = input.next();
			}
			if (!k.equals("n")) {
				int n = use.showFist();
				int m = com.showFist();
				startGame(n,m);
			}else {
				break;
			}
		count++;
		} while (true);
		
		//输出猜拳结果
		
		use.jf=count2;
		com.jf=count3;
		jg(use.name,use.jf,com.name,com.jf);
	}
	//双方开始出拳
	public static void startGame(int n ,int m){
		if (n==m) {
			System.out.println("结果说：平局");
		}else if (n-m==-2||n-m==1) {
			System.out.println("结果说：玩家胜");
			count2+=1;
		}else {
			System.out.println("结果说：电脑胜");
			count3+=1;
		}
	}
	public static void jg(String name,int n,String name2,int m){
		System.out.println(name+"\tVS\t"+name2);
		System.out.println("对战次数："+count);
		System.out.println();
		System.out.println("姓名\t\t得分");
		System.out.println(name+"\t\t"+n);
		System.out.println(name2+"\t\t"+m);
		if (n>m) {
			System.out.println("结果：恭喜恭喜，你战胜了电脑！！！");
		}else if (n==m) {
			System.out.println("结果：你和电脑打成了平手，不错哦！！！");
		}else {
			System.out.println("结果：不好意思你输给了电脑，再接再厉哦！！！");
		}
		
	}
	public static void main(String[] args) {
		//欢迎界面		
		hy();
		//询问是否开始
		ks();
	} 
}



















