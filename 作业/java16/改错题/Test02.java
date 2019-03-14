package 第15章继承作业____3编写代码找错并纠错;

abstract class Shape{
	//几何图形
	public abstract double getArea();
}
class Square extends Shape{
	private double height = 0;//正方形边长
	public Square(double height){
		this.height=height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.height*this.height);
	}	
}
class Circle extends Shape{
	private double r=0; //圆的半径
	private final static double PI=3.14;//圆周率
	public  Circle(double r){
		this.r=r;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}
}
public class Test02 {
	public static void main(String[] args) {
		Shape square =new Square(3);
		Shape circle =new Circle(2);
		System.out.println(square.getArea());
		System.out.println(circle.getArea());
		//只能子类强转为父类而不能在子类之间想回转换，父类能直接调用子类重写父类的方法
		/*
		 * if(teacher instanceof TuringDBTeacher ){
				//如果实例化对象teacher是TuringDBTeacher子类中的对象
				//那么子类TuringDBTeacher  teacher强转为子类对象teacher1(TuringDBTeacher)
				//这样就能调用子类对象中独有的方法了teacher1.sayHi();
				TuringDBTeacher teacher1 = (TuringDBTeacher)teacher;
				teacher1.sayHi();
				teacher1.giveLesson();
			}
		 */
		//要我改成啥样子我不知道
		//子类之间不能相互转化
		//Square sq = (Square)circle;
		Square sq = new Square(2);
		System.out.println(sq.getArea());
		
	}
}
