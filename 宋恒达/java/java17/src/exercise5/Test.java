package exercise5;
/**
 * �޸����´��룬���������д���
 * @author mo
 *
 */
public class Test implements Conslans {
	public static void main(String[] args) {
		Conslans con = new Test();//����ֱ��ʵ����
		System.out.println(con.MAX); 
		int i = 50;
		if (i > Conslans.MAX) {
//		 Conslans.MAX-=i;//���ܽ����޸ģ�final�ؼ�������
		}
	}
}
