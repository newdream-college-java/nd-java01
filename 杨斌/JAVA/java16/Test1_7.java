package com.java.java16;
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
public class Test1_7 {
	public static void main(String[] args) {
		Shape square=new Square(3);
		Shape circle=new Circle(3);
		System.out.println(square.getArea());
		System.out.println(circle.getArea());
		Square sq=(Square)square;
		System.out.println(sq.getArea());
	}
}
