package com.song;

import java.util.Scanner;
/**
 * 1石头 2剪刀 3布
 *    人 				电脑				结果
 *1				1				平
 *1				2				人
 *1				3				电脑
 *2				1				电脑
 *2				2				平
 *2				3				人
 *3				1				人
 *3				2				电脑
 *3				3				平	
 * @author mo
 *
 */
public class Game {
	Person person;
	Computer computer;
	int count;
	public void initial() {
		person = new Person();
		computer = new Computer();
		person.name="匿名";
		person.score=0;
		computer.score=0;
		count=0;
	}

	public void startGame() {
		Scanner input=new Scanner(System.in);
		System.out.println("--------------------欢迎，进入猜拳游戏\n\n\n");
		System.out.println("\t\t*********************************");
		System.out.println("\t\t**\t猜拳开始\t**");
		System.out.println("\t\t*************");
		System.out.println("出拳规则:1.石头，2.剪刀，3，布");
		System.out.println("请选择对方角色:(1.刘备，2.孙权，3.曹操)");
		int role=input.nextInt();
		switch (role) {
			case 1:
				System.out.println("你选择了与刘备对战");
				computer.name="刘备";
				break;
			case 2:
				System.out.println("你选择了与孙权对战");
				computer.name="孙权";
				break;
			case 3:
				System.out.println("你选择了与曹操对战");
				computer.name="曹操";
				break;
			default:
				System.out.println("你的输入有误");
				break;
		}
		System.out.println("要开始吗？(y/n):");
		String isStart=input.next();
		if(isStart.equals("y")) {
			play();
		}else {
			System.exit(-1);
		}
		
	}
	//对战
	public void play() {
		//开始对决
				//1.人先出拳
				String anwser=null;
				Scanner in=new Scanner(System.in);
				do {
				int ren=person.punch();
				//2.电脑出拳
				int com=computer.punch();
				if(ren==com) {
					System.out.println("平局");
				}else if((ren-com==-1)||(ren-com==2)) {
					System.out.println("人赢了");
					person.score++;
				}else {
					System.out.println("电脑赢了");
					computer.score++;
				}
				count++;
				System.out.println("是否开始下一局比赛(y/n)");
				anwser=in.next();
				}while(anwser.equals("y"));
	}
	//显示最终的对战结果
	public void showResult(){
		System.out.println(computer.name+"\tVS\t"+person.name);
		System.out.println("对局局数:"+count);
		if(computer.score>person.score) {
			System.out.println("你输了");
		}else if(computer.score<person.score) {
			System.out.println("你赢了");
		}else {
			System.out.println("平局");
		}
	}
}
