package ��ҵ;
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
//		Square sq=(Square)c;//û�м̳й�ϵ����ǿ��ת��
//		System.out.println(sq.getArea());//�����β���תԲ��
		//��
		if(s instanceof Square){
			Square sq=(Square)s;
			System.out.println(sq.getArea());
		}else if(c instanceof Circle){
			Circle ci=(Circle)c;
			System.out.println(ci.getArea());
		}
	}

}
