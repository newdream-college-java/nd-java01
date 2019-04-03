package exercise7;
/**
 * 编写下面的代码，并改正错误
 */
public class Test {
	public void test(){
		try {
			System.out.println("try");
		}catch(NullPointerException e) {
			System.out.println("catch 3");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 1");
		}catch(Exception e) {		//放在最后，来捕获出已知异常外的异常
			System.out.println("catch 2");
		}
	}
}
