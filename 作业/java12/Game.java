package 人机猜拳2;

import java.util.Scanner;


public class Game {
	//人对象的创立
Person p=new Person();
	//电脑对象的创立
Computer c =new Computer();
String roleName;
int sum=0;
String a;

public void initial(){
	Scanner input = new Scanner(System.in);
	System.out.println("-------------------------欢迎进入游戏世界-------------------\n\n");
	System.out.println("**********************");
	System.out.println("**\t猜拳，开始\t**");
	System.out.println("*****************************\n\n");
	System.out.println("出拳规则：1.剪刀2.石头3.布");
	System.out.println("请输入你的名字");
	p.name=input.next();
	role();
}
public void gameStart(){
	Scanner input =new Scanner(System.in);
	System.out.println("是否进入游戏(y/n)");
	String a = input.next();
	while(a.equals("y")){
		compare();
		sum++;
		System.out.println("是否进入游戏(y/n)");
		a = input.next();
		/*
		 	do{
		System.out.println("是否进入游戏(y/n)");
		a =input.next();
		compare();
		sum++;
		
	}while(a.equals("y"));

		 */
	}
	show();
	
}
public void role(){
	Scanner input = new Scanner(System.in);
	System.out.println("请选择与你对战的角色1.刘备\t2.孙权\t3.曹操");
	int crole = input.nextInt();
	switch(crole){
		case 1:
			System.out.println("刘备");
			roleName="刘备";
			break;
		case 2:
			System.out.println("孙权");
			 roleName="孙权";
			break;
		case 3:
			System.out.println("曹操");
			 roleName="曹操";
			break;
	}
	gameStart();
}
public void compare(){
	 /*
	   		P		c			result
	   		1		1		p-c=0		平
	   		1		2		p-c=-1		c赢
	   		1		3		p-c=-2		p赢
	   		2		1		p-c=1		p赢
	   		2		2		p-c=0		平
	   		2		3		p-c=-1		c赢
	   		3		1		p-c=2		c赢
	   		3		2		p-c=1		p赢
	   		3		3			0		平
	  */
	p.fun();
	c.fun();
	if(p.chuQuan-c.chuQuan==-1){
		System.out.println("你输了");
		c.score++;
	
	}else if(p.chuQuan==c.chuQuan){
		System.out.println("平局");
	}else{
		System.out.println("你赢了");
		p.score++;
	}

}
public void show(){
	System.out.println(p.name+"VS"+roleName);
	System.out.println("对战次数"+sum+"\n");
	System.out.println("姓名\t"+"得分");
	System.out.println(p.name+"\t"+p.score);
	System.out.println(roleName+"\t"+c.score);
	result();
}
public void result(){
	if(p.score>c.score){
		System.out.println("\n\n恭喜恭喜");
	}else if(p.score==c.score){
		System.out.println("\n\n平局");
	}else{
		System.out.println("\n\n你输了，怎么连个电脑都打不过");
	}
	
}
}
