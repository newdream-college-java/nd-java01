//循环要问“你的名字叫什么？”。如果回答“不告诉你”，就继续问，否则输出“你的名字原来叫：**”。编程实现。

import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("你的名字叫什么?");
		String name = input.next();
		while(name.equals("不告诉你")){
		System.out.println("你的名字叫什么?");
		name = input.next();
		}
		System.out.print("原来你的名字叫"+name);
	}
}