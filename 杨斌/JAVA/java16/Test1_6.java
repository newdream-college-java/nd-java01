package com.java.java16;
abstract class  TuringTeacher{
	public abstract void sayHi();
	public void giveLesson(){
		System.out.println("知识点讲解");
		System.out.println("总结提问");
	}
}
class TuringDBTeacher extends TuringTeacher{
	public void giveLesson(){
		System.out.println("启动Sqlserver");
		super.giveLesson();
	}

	public void sayHi() {
		System.out.println("Hi");
		
	}
}
public class Test1_6 {
	public static void main(String[] args) {
		TuringTeacher teacher=new TuringDBTeacher();
		teacher.sayHi();
		teacher.giveLesson();
	}
}
