package 第15章继承作业____3编写代码找错并纠错;

class TuringTeacher{
	public void giveLesson(){
		System.out.println("知识点讲解");
		System.out.println("总结提问");
	}
}
class TuringDBTeacher extends TuringTeacher{
	public void giveLesson(){
		System.out.println("启动SqlServer");
		super.giveLesson();
	}
	public void sayHi(){
		System.out.println("Hi");
	}
}
	public class Test01 {
		public static void main(String[] args) {
			TuringTeacher teacher = new TuringDBTeacher();
			//错误原因：在这里使用了多态，teacher是父类引用但是sayHi是子类TuringDBTeacher中的独有的方法，不是子类TuringDBTeacher重写父类的方法
			//所以不能直接调用要进行引用类型的转换
			//修改
			if(teacher instanceof TuringDBTeacher ){
				//如果实例化对象teacher是TuringDBTeacher子类中的对象
				//那么子类TuringDBTeacher  teacher强转为子类对象teacher1(TuringDBTeacher)
				//这样就能调用子类对象中独有的方法了teacher1.sayHi();
				TuringDBTeacher teacher1 = (TuringDBTeacher)teacher;
				teacher1.sayHi();
				teacher1.giveLesson();
			}
			
		}
}	
