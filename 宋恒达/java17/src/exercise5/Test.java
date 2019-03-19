package exercise5;
/**
 * 修改以下代码，并纠正其中错误
 * @author mo
 *
 */
public class Test implements Conslans {
	public static void main(String[] args) {
		Conslans con = new Test();//不能直接实例化
		System.out.println(con.MAX); 
		int i = 50;
		if (i > Conslans.MAX) {
//		 Conslans.MAX-=i;//不能进行修改，final关键字修饰
		}
	}
}
