package 十六章作业;


	abstract class Shape{
		public abstract double getArea();
	}
	class Square extends Shape{
		private double height=0;
		public Square (double height){
			this.height=height;
		}
		public double getArea(){
			return(this.height*this.height);
		}
	}
	class Circle extends Shape{
		private double r=0;
		private final static double PI=3.14;
		public Circle(double r){
			this.r=r;
		}
		public double getArea(){
			return PI*r*r;
		}
	}
	public class Test7{
		public static void main(String[] args){
			Shape square=new Square(3);
			Shape circle=new Circle(2);
			System.out.println(square.getArea());
			System.out.println(circle.getArea());
		//	Shape sq=(Circle)circle;//Square与Circle都是子类 不能强制转换
			System.out.println(((Circle) circle).getArea());
			
			
			
			
			
			
			
		}
	}