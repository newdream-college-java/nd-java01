package exercise7;
/**
 * ��д����Ĵ��룬����������
 */
public class Test {
	public void test(){
		try {
			System.out.println("try");
		}catch(NullPointerException e) {
			System.out.println("catch 3");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 1");
		}catch(Exception e) {		//����������������֪�쳣����쳣
			System.out.println("catch 2");
		}
	}
}
