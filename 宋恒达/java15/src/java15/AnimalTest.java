package java15;
/**
 * ���Bird��Fish�࣬���̳��Գ�����Animal,ʵ����
 * ���󷽷�info();�������ǵ���Ϣ
 * @author mo
 *
 */
public class AnimalTest {
	public static void main(String[] args) {
		Bird b=new Bird("��ɫ",4);
		b.print();
		
		Fish f=new Fish(5,2);
		f.print();
	}
}
