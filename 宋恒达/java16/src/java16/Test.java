package java16;
/*
 * 改正错误：当父类引用指向子类对象时，只能调用子类重写父类方法
 */
public class Test {
	public static void main(String[] args) {
		TuringTeacher teacher=new TuringDBTeacher();
		teacher.giveLesson();
		teacher.sayHi();
	}
}
