package 作业;
abstract class Shape{
	public abstract double getArea();
}
class Square extends Shape{
	private double height=0;
	public Square(double height){
		this.height=height;
	}
	public double getArea() {
		return (this.height*this.height);
	}
}
class Circle extends Shape{
	private double r=0;
	private final static double PI=3.14;
	public Circle(double r){
		this.r=r;
	}
	public double getArea() {
		return PI*r*r;
	}
}
class Zy7 {
	public static void main(String[] args) {
		Shape s=new Square(3);
		Shape c=new Circle(2);
		System.out.println(s.getArea());
		System.out.println(c.getArea());
//		Square sq=(Square)c;//没有继承关系不能强制转换
//		System.out.println(sq.getArea());//正方形不能转圆形
		//改
		if(s instanceof Square){
			Square sq=(Square)s;
			System.out.println(sq.getArea());
		}else if(c instanceof Circle){
			Circle ci=(Circle)c;
			System.out.println(ci.getArea());
		}
	}

}
