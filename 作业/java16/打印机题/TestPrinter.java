package ��15�¼̳���ҵ____2��������;

public class TestPrinter {
	public static void main(String[] args) {
		Printer p1=new DotmatrixPrinter();
		//���ַ�ʽ
		//��ʽһnew������p1����Ϊ����DotmatrixPrinter������дprint����
		//����ֱ����p1����DotmatrixPrinter�е�print����
		p1.print();
		//��ʽ��
		//дһ������(fun)���������ã��β�Printer p����Ϊ����ʵ�ָ���Ĵ�ӡ����
		//��new������������󣬽�ʵ���������������Ϊʵ�δ��뷽��fun
		p1.print();
		Printer p2 =new InkperPrinter();
		p2.print();
		fun(p2);
		Printer p3 =new LaserPrinter();
		p3.print();
		fun(p3);
	}
	//��ʽ��
	//��������Ϊ�������뷽��fun��s
	public static void fun(Printer p){
		p.print();
	}
}
