

public class TestShape {

	public static void main(String[] args) {
		Shape square = new Square(3);
		Shape circle=new Circle(2);
		System.out.println(square.getArea());
		System.out.println(circle.getArea());
		//�����ǿ��ת��Ӧ����Ҫ�Ѹ�������ת����square���������ã�����ȴ���ֵ���circle�Ķ���ŵ�������
		//�޸�Square sq=(Square)circle;
		Square sq=(Square) square;
		System.out.println(sq.getArea());
	}

}
