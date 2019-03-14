

class Tset {
	public static void main(String[] args) {
		TuringTeacher teacher=new TuringDBTeacher();
		//这里的sayHi方法是子类独有而父类没有的，父类引用并不能直接访问这个方法。
		//解决方法1： 将父类弄成抽象类，然后在父类创造sayHi的抽象方法并在子类中重写；
		//解决方法2：强制转化为子类引用
		//此处用方法2
		TuringDBTeacher a=(TuringDBTeacher) teacher;
		a.sayHi();
		teacher.giveLesson();
	}
}
