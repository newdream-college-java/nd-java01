package ��ҵ;

public class Zy7 {
	public void test() {
		try {
			System.out.println("try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 1");
//		}catch (Exception e) {
//			System.out.println("catch 2");
//		}catch (NullPointerException e) {
//			System.out.println("catch 3");
//		}
			//Exception ����ǰ��Ļ� ����Ĳ���ִ��
		}catch (NullPointerException e) {
			System.out.println("catch 2");
		}catch (Exception e) {
			System.out.println("catch 3");
		}
	}

}
