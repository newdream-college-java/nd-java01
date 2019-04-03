package java15;
/**
 * 设计Bird、Fish类，都继承自抽象类Animal,实现其
 * 抽象方法info();并打它们的信息
 * @author mo
 *
 */
public class AnimalTest {
	public static void main(String[] args) {
		Bird b=new Bird("红色",4);
		b.print();
		
		Fish f=new Fish(5,2);
		f.print();
	}
}
