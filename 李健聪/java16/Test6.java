package 十六章作业;

 class TuringTeacher {
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
	public class Test6{
		public	static void main(String[] args) {//static 去掉
			TuringTeacher teacher=new TuringDBTeacher();
			TuringDBTeacher a=(TuringDBTeacher)teacher;//把父类对象引用的子类对象强制转换成子类对象
		//	((TuringDBTeacher) teacher).sayHi();//不能通过teacher直接调用
			a.giveLesson();
			a.sayHi();
			
		}
	}
	

