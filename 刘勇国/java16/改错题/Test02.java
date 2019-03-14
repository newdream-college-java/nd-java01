package ��15�¼̳���ҵ____3��д�����Ҵ�����;

abstract class Shape{
	//����ͼ��
	public abstract double getArea();
}
class Square extends Shape{
	private double height = 0;//�����α߳�
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
	private double r=0; //Բ�İ뾶
	private final static double PI=3.14;//Բ����
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
		//ֻ������ǿתΪ���������������֮�����ת����������ֱ�ӵ���������д����ķ���
		/*
		 * if(teacher instanceof TuringDBTeacher ){
				//���ʵ��������teacher��TuringDBTeacher�����еĶ���
				//��ô����TuringDBTeacher  teacherǿתΪ�������teacher1(TuringDBTeacher)
				//�������ܵ�����������ж��еķ�����teacher1.sayHi();
				TuringDBTeacher teacher1 = (TuringDBTeacher)teacher;
				teacher1.sayHi();
				teacher1.giveLesson();
			}
		 */
		//Ҫ�Ҹĳ�ɶ�����Ҳ�֪��
		//����֮�䲻���໥ת��
		//Square sq = (Square)circle;
		Square sq = new Square(2);
		System.out.println(sq.getArea());
		
	}
}
